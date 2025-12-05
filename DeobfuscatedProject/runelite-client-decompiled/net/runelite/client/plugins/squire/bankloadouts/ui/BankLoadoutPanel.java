/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.GameState
 *  net.runelite.api.ItemComposition
 */
package net.runelite.client.plugins.squire.bankloadouts.ui;

import com.google.inject.Inject;
import gg.squire.client.util.Storage;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.GameState;
import net.runelite.api.ItemComposition;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.events.StorageChanged;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.squire.BankLoadouts;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadoutPlugin;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.plugins.squire.inventory.InventorySetup;
import net.runelite.client.plugins.squire.runepouch.RunePouchSetup;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.util.AsyncBufferedImage;
import net.unethicalite.api.game.Game;

public class BankLoadoutPanel
extends PluginPanel {
    private static final String LOADOUTS_FOLDER = "loadouts";
    private final Storage<BankLoadout> bankLoadouts = Storage.of(BankLoadout.class);
    private final Map<String, BankLoadout> cache = new HashMap<String, BankLoadout>();
    private final BankLoadoutPlugin plugin;
    private final ItemManager itemManager;
    private final ExecutorService executorService;
    private final EventBus eventBus;
    private final JLabel title = new JLabel();
    private DefaultComboBoxModel<Storage.StorageEntry> model;
    private BankLoadout loadout;
    private JTextField name;

    @Inject
    public BankLoadoutPanel(BankLoadoutPlugin plugin, ItemManager itemManager, ExecutorService executorService, EventBus eventBus) {
        this.plugin = plugin;
        this.itemManager = itemManager;
        this.executorService = executorService;
        this.eventBus = eventBus;
        this.loadout = BankLoadout.empty();
        this.bankLoadouts.create();
        this.reload();
    }

    private void reload() {
        BankLoadouts.setWithdrawing(null);
        this.removeAll();
        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 0, 10));
        this.setBackground(ColorScheme.DARK_GRAY_COLOR);
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = 2;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 10, 0);
        this.model = new DefaultComboBoxModel();
        this.model.removeAllElements();
        List<Storage.StorageEntry> entries = this.bankLoadouts.getEntries(Storage.IS_JSON);
        this.model.addAll(entries);
        if (this.loadout.getName() != null && !this.loadout.getName().isEmpty()) {
            Storage.StorageEntry matching = entries.stream().filter(s -> s.getName().equals(this.loadout.getName())).findFirst().orElse(null);
            this.model.setSelectedItem(matching);
        }
        JComboBox<Storage.StorageEntry> loadoutBox = new JComboBox<Storage.StorageEntry>(this.model);
        loadoutBox.addActionListener(i -> {
            Storage.StorageEntry entry = (Storage.StorageEntry)this.model.getSelectedItem();
            this.loadout = entry == null ? BankLoadout.empty() : this.cache.computeIfAbsent(entry.getName(), e -> this.bankLoadouts.parse(entry));
            if (this.loadout.getEquipmentSetup().getCompositions() == null) {
                this.loadout.getEquipmentSetup().load(eq -> SwingUtilities.invokeLater(this::reload));
            } else {
                SwingUtilities.invokeLater(this::reload);
            }
        });
        this.add(loadoutBox, c);
        JLabel equipmentLabel = new JLabel("Equipment");
        this.add((Component)equipmentLabel, c);
        ++c.gridy;
        c.gridwidth = 0;
        this.add((Component)this.equipment(), c);
        ++c.gridy;
        this.add((Component)this.inventory(), c);
        ++c.gridy;
        this.add((Component)this.pouch(), c);
        ++c.gridy;
        this.name = new JTextField();
        this.name.setText(this.loadout.getName());
        this.add((Component)this.name, c);
        ++c.gridy;
        JButton withdraw = new JButton("Withdraw/Equip");
        withdraw.addActionListener(a -> this.executorService.submit(() -> {
            Storage.StorageEntry selected = (Storage.StorageEntry)this.model.getSelectedItem();
            if (selected == null) {
                return;
            }
            BankLoadouts.withdraw(this.bankLoadouts.parse(selected));
        }));
        this.add((Component)withdraw, c);
        ++c.gridy;
        JButton load = new JButton("Refresh");
        load.addActionListener(a -> this.executorService.submit(this::onRefreshClick));
        this.add((Component)load, c);
        ++c.gridy;
        JButton save = new JButton("Save loadout");
        save.addActionListener(a -> this.executorService.submit(this::onSaveClick));
        this.add((Component)save, c);
        ++c.gridy;
        JButton delete = new JButton("Delete loadout");
        delete.addActionListener(a -> this.executorService.submit(this::onDeleteClick));
        this.add((Component)delete, c);
        this.validate();
    }

    private void onRefreshClick() {
        if (Game.getState() != GameState.LOGGED_IN) {
            return;
        }
        this.loadout = BankLoadout.get();
        SwingUtilities.invokeLater(this::reload);
    }

    private void onSaveClick() {
        if (this.name.getText().trim().isEmpty()) {
            return;
        }
        this.loadout = BankLoadout.get();
        Storage.StorageEntry selected = (Storage.StorageEntry)this.model.getSelectedItem();
        this.loadout.setName(this.name.getText());
        this.bankLoadouts.save(this.loadout, this.name.getText());
        Storage.StorageEntry entry = this.bankLoadouts.save(this.loadout, this.name.getText());
        this.cache.put(this.name.getText(), this.loadout);
        if (selected == null || !selected.getName().equals(entry.getName())) {
            this.model.addElement(entry);
            this.model.setSelectedItem(entry);
        }
        SwingUtilities.invokeLater(this::reload);
        this.reloadConfigPanel();
    }

    private void reloadConfigPanel() {
        this.eventBus.post(new StorageChanged());
    }

    private void onDeleteClick() {
        Storage.StorageEntry selected = (Storage.StorageEntry)this.model.getSelectedItem();
        if (selected == null) {
            return;
        }
        this.bankLoadouts.delete(selected);
        this.model.setSelectedItem(null);
        this.model.removeElement(selected);
        SwingUtilities.invokeLater(this::reload);
    }

    private JLabel inventory() {
        JLabel inventory = new JLabel();
        InventorySetup setup = this.loadout.getInventorySetup();
        BufferedImage bi = setup.render();
        if (bi instanceof AsyncBufferedImage) {
            ((AsyncBufferedImage)bi).addTo(inventory);
        } else {
            inventory.setIcon(new ImageIcon(bi));
        }
        return inventory;
    }

    private JLabel pouch() {
        BufferedImage bi;
        JLabel pouch = new JLabel();
        RunePouchSetup rps = this.loadout.getRunePouchSetup();
        if (rps == null) {
            rps = new RunePouchSetup();
        }
        if ((bi = rps.render(this.itemManager)) instanceof AsyncBufferedImage) {
            ((AsyncBufferedImage)bi).addTo(pouch);
        } else {
            pouch.setIcon(new ImageIcon(rps.render(this.itemManager)));
        }
        return pouch;
    }

    private JPanel equipment() {
        JPanel panel = new JPanel();
        panel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        panel.setLayout(gridBagLayout);
        gridBagConstraints.fill = 1;
        gridBagConstraints.gridx = 1;
        gridBagConstraints.insets = new Insets(1, 1, 1, 0);
        JLabel head = this.getLabelFor(EquipmentInventorySlot.HEAD);
        panel.add((Component)head, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        JLabel cape = this.getLabelFor(EquipmentInventorySlot.CAPE);
        panel.add((Component)cape, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        JLabel amulet = this.getLabelFor(EquipmentInventorySlot.AMULET);
        panel.add((Component)amulet, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        JLabel ammo = this.getLabelFor(EquipmentInventorySlot.AMMO);
        panel.add((Component)ammo, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        JLabel weapon = this.getLabelFor(EquipmentInventorySlot.WEAPON);
        panel.add((Component)weapon, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        JLabel body = this.getLabelFor(EquipmentInventorySlot.BODY);
        panel.add((Component)body, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        JLabel shield = this.getLabelFor(EquipmentInventorySlot.SHIELD);
        panel.add((Component)shield, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        JLabel legs = this.getLabelFor(EquipmentInventorySlot.LEGS);
        panel.add((Component)legs, gridBagConstraints);
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        JLabel gloves = this.getLabelFor(EquipmentInventorySlot.GLOVES);
        panel.add((Component)gloves, gridBagConstraints);
        gridBagConstraints.gridx = 1;
        JLabel boots = this.getLabelFor(EquipmentInventorySlot.BOOTS);
        panel.add((Component)boots, gridBagConstraints);
        gridBagConstraints.gridx = 2;
        JLabel ring = this.getLabelFor(EquipmentInventorySlot.RING);
        panel.add((Component)ring, gridBagConstraints);
        return panel;
    }

    private JLabel getLabelFor(EquipmentInventorySlot slot) {
        JLabel slotLabel = new JLabel();
        EquipmentSetup equipmentSetup = this.loadout.getEquipmentSetup();
        BufferedImage bufferedImage = equipmentSetup.getImageForSlot(slot, this.itemManager);
        if (bufferedImage instanceof AsyncBufferedImage) {
            ((AsyncBufferedImage)bufferedImage).addTo(slotLabel);
        } else {
            slotLabel.setIcon(new ImageIcon(bufferedImage));
        }
        ItemComposition item = equipmentSetup.getComposition(slot);
        slotLabel.setToolTipText(item == null ? "Empty" : item.getName());
        return slotLabel;
    }

    private JPanel buildInventoryPanel() {
        JPanel main = new JPanel();
        main.setLayout(new GridBagLayout());
        this.title.setText("Equipment");
        GridBagConstraints c = new GridBagConstraints();
        c.fill = 2;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 10, 0);
        JPanel helmet = new JPanel();
        return main;
    }
}

