import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calcRemDist {
    public static void main(String[] args) {
        // Create a JFrame and a JPanel
        JFrame frame = createFrame();
        JPanel panel = createPanel();
        addComponentsToPanel(panel);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static JFrame createFrame() {
        // Set properties for the JFrame
        JFrame frame = new JFrame("Elektroauto Reichweitenrechner");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        return frame;
    }

    private static JPanel createPanel() {
        return new JPanel();
    }

    private static void addComponentsToPanel(JPanel panel) {
        // Create labels and fields for text in the JPanel
        // Create consumption label and field for text
        // Create capacity labels and field for text
        JLabel consumptionLabel = new JLabel("Verbrauch pro 100 km (in kWh):");
        JTextField consumptionField = new JTextField(10);
        JLabel capacityLabel = new JLabel("Aktuelle Kapazität des Akkus (in kWh):");
        JTextField capacityField = new JTextField(10);

        // Create a driving style label
        JLabel drivingStyleLabel = new JLabel("Fahrweise:");
        String[] drivingStyles = {"Sportlich", "Normal", "Ökonomisch"};
        JComboBox<String> drivingStyleComboBox = new JComboBox<>(drivingStyles);

        // Create a weather label
        JLabel weatherLabel = new JLabel("Wetter:");
        String[] weatherConditions = {"Sonnig", "Regen", "Schnee"};
        JComboBox<String> weatherComboBox = new JComboBox<>(weatherConditions);

        // Create a button
        JButton calculateButton = new JButton("Berechnen");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                performCalculation(consumptionField,
                        capacityField,
                        drivingStyleComboBox,
                        weatherComboBox);
            }
        });

        // add everything to the panel
        panel.add(consumptionLabel);
        panel.add(consumptionField);
        panel.add(capacityLabel);
        panel.add(capacityField);
        panel.add(drivingStyleLabel);
        panel.add(drivingStyleComboBox);
        panel.add(weatherLabel);
        panel.add(weatherComboBox);
        panel.add(calculateButton);
    }

    private static void performCalculation(JTextField consumptionField,
                                           JTextField capacityField,
                                           JComboBox<String> drivingStyleComboBox,
                                           JComboBox<String> weatherComboBox) {
        try {
            double consumption = Double.parseDouble(consumptionField.getText());
            double capacity = Double.parseDouble(capacityField.getText());

            if (consumption < 0 || capacity < 0) {
                JOptionPane.showMessageDialog(null, "Fehler: Die Eingaben dürfen nicht negativ sein.");
            } else {
                double adjustedConsumption = adjustConsumption(consumption, drivingStyleComboBox.getSelectedIndex());
                adjustedConsumption = adjustConsumptionForWeather(adjustedConsumption, weatherComboBox.getSelectedIndex());
                double remainingDistance = capacity / adjustedConsumption * 100;
                int dialogResult = JOptionPane.showConfirmDialog(null,
                        "Die verbleibende Reichweite beträgt: " +
                                String.format("%.2f", remainingDistance) + " km." +
                                "\nMöchten Sie eine neue Berechnung durchführen?",
                        "Ergebnis", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.NO_OPTION) {
                    System.exit(0);
                } else {
                    consumptionField.setText("");
                    capacityField.setText("");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,
                    "Fehler: Ungültiges Zahlenformat. \nStatt Komma bitte Punkt verwenden!");
        }
    }

    private static double adjustConsumption(double consumption, int drivingStyleIndex) {
        switch (drivingStyleIndex) {
            case 0: // sport-mode
                return consumption * 1.2;   // Increases consumption-rate by 20%
            case 1: // normal-mode
                return consumption;         // No adjustment
            case 2: // eco-mode
                return consumption * 0.8;   // Decreases consumption-rate by 20%
            default:
                return consumption;
        }
    }

    private static double adjustConsumptionForWeather(double consumption, int weatherIndex) {
        switch (weatherIndex) {
            case 0: // sunny-weather
                return consumption * 0.9; // Decreases consumption-rate by 10%
            case 1: // rainy-weather
                return consumption * 1.1; // Increases consumption-rate by 10%
            case 2: // snowy-weather
                return consumption * 1.3; // Increases consumption-rate by 30%
            default:
                return consumption;
        }
    }
}
