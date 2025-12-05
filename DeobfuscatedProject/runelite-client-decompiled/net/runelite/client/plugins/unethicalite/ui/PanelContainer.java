/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.miginfocom.swing.MigLayout
 */
package net.runelite.client.plugins.unethicalite.ui;

import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.lang.reflect.Type;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerNumberModel;
import javax.swing.text.JTextComponent;
import net.miginfocom.swing.MigLayout;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.ui.components.ComboBoxListRenderer;
import net.runelite.client.util.Text;
import net.unethicalite.client.config.SquireConfig;

public abstract class PanelContainer
extends JPanel {
    private final String title;
    protected final SquireConfig config;
    protected final ConfigManager configManager;

    public PanelContainer(String title, SquireConfig config, ConfigManager configManager) {
        this.title = title;
        this.config = config;
        this.configManager = configManager;
        this.setLayout((LayoutManager)new MigLayout());
        this.rebuild();
    }

    protected JCheckBox createCheckBox(String text, String configKey) {
        JCheckBox checkBox = new JCheckBox(text);
        checkBox.setSelected((Boolean)this.configManager.getConfiguration("squire", configKey, (Type)((Object)Boolean.class)));
        checkBox.addChangeListener(l -> this.configManager.setConfiguration("squire", configKey, ((JCheckBox)l.getSource()).isSelected()));
        return checkBox;
    }

    protected JPanel createComboBoxSection(String text, String key, Class<? extends Enum> type) {
        JPanel section = new JPanel();
        section.add(new JLabel(text));
        JComboBox<Enum> box = new JComboBox<Enum>(type.getEnumConstants());
        box.setRenderer(new ComboBoxListRenderer());
        box.setForeground(Color.WHITE);
        box.setFocusable(false);
        try {
            Enum selectedItem = Enum.valueOf(type, this.configManager.getConfiguration("squire", key));
            box.setSelectedItem(selectedItem);
            box.setToolTipText(Text.titleCase(selectedItem));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        box.addItemListener(e -> {
            if (e.getStateChange() == 1) {
                this.configManager.setConfiguration("squire", key, e.getItem());
                box.setToolTipText(Text.titleCase((Enum)box.getSelectedItem()));
            }
        });
        section.add(box);
        return section;
    }

    protected JPanel createTextSection(String text, final String key, boolean secret) {
        JTextComponent textField;
        JPanel section = new JPanel();
        section.add(new JLabel(text));
        if (secret) {
            textField = new JPasswordField();
        } else {
            JTextArea textArea = new JTextArea();
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textField = textArea;
        }
        textField.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        textField.setText(this.configManager.getConfiguration("squire", key));
        textField.addFocusListener(new FocusAdapter(){

            @Override
            public void focusLost(FocusEvent e) {
                PanelContainer.this.configManager.setConfiguration("squire", key, textField.getText());
            }
        });
        section.add(textField);
        return section;
    }

    protected JPanel createIntSection(String text, String key, int value, int min, int max) {
        JPanel section = new JPanel();
        section.add(new JLabel(text));
        SpinnerNumberModel model = new SpinnerNumberModel(value, min, max, 1);
        JSpinner spinner = new JSpinner(model);
        JComponent editor = spinner.getEditor();
        JFormattedTextField spinnerTextField = ((JSpinner.DefaultEditor)editor).getTextField();
        spinnerTextField.setColumns(6);
        spinner.addChangeListener(ce -> this.configManager.setConfiguration("squire", key, value));
        section.add(spinner);
        return section;
    }

    protected abstract void rebuild();

    public String getTitle() {
        return this.title;
    }
}

