/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Inject
 *  gg.squire.client.util.Storage
 *  gg.squire.client.util.Storage$StorageEntry
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.ItemComposition
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.events.StorageChanged
 *  net.runelite.client.game.ItemManager
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.runelite.client.ui.ColorScheme
 *  net.runelite.client.ui.PluginPanel
 *  net.runelite.client.util.AsyncBufferedImage
 */
package i.i.b.s.c.q.r.s.s.-.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.gearloadouts.GearLoadoutPlugin;
import gg.squire.client.util.Storage;
import i.i.b.s.c.q.r.s.s.-.u.a.e.aw_Unknown;
import i.i.b.s.c.q.r.s.s.-.u.a.e.ax;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.ItemComposition;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.events.StorageChanged;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;
import net.runelite.client.util.AsyncBufferedImage;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public class av_Unknown
extends PluginPanel {
    private final /* synthetic */ EventBus dt;
    private final /* synthetic */ Map<String, EquipmentSetup> dq;
    /* synthetic */ EquipmentSetup dy;
    private final /* synthetic */ ItemManager ds;
    private final /* synthetic */ DefaultComboBoxModel<Storage.StorageEntry> do;
    private final /* synthetic */ JCheckBox dx;
    final /* synthetic */ JButton dv;
    private final /* synthetic */ Map<EquipmentInventorySlot, JLabel> dw;
    private static /* synthetic */ String[] lIlllIIll;
    /* synthetic */ boolean dz;
    private final /* synthetic */ Storage<EquipmentSetup> dp;
    private final /* synthetic */ GearLoadoutPlugin dr;
    private final /* synthetic */ JTextField du;
    private static /* synthetic */ int[] lIlllIlII;

    private static boolean lIlIIIIllII(Object object) {
        return object != null;
    }

    private static void lIlIIIIlIll() {
        lIlllIlII = new int[12];
        av.lIlllIlII[0] = 115 + 57 - 94 + 108 ^ 17 + 161 - 172 + 170;
        av.lIlllIlII[1] = 0x2C ^ 0x6F ^ (0xF2 ^ 0xA8);
        av.lIlllIlII[2] = (0x21 ^ 0x5B ^ (0xBB ^ 0xC7)) & (39 + 110 - 143 + 145 ^ 115 + 136 - 202 + 96 ^ -1);
        av.lIlllIlII[3] = 2;
        av.lIlllIlII[4] = 0x7B ^ 0x56 ^ (0x52 ^ 0x7A);
        av.lIlllIlII[5] = 1;
        av.lIlllIlII[6] = -1;
        av.lIlllIlII[7] = 3;
        av.lIlllIlII[8] = 0x85 ^ 0x81;
        av.lIlllIlII[9] = 111 + 43 - 40 + 35 ^ 25 + 127 - 141 + 136;
        av.lIlllIlII[10] = 0x17 ^ 0x10;
        av.lIlllIlII[11] = 0x30 ^ 0x38;
    }

    /*
     * WARNING - void declaration
     */
    private void a(DefaultComboBoxModel<Storage.StorageEntry> defaultComboBoxModel, JComboBox<Storage.StorageEntry> jComboBox) {
        Storage.StorageEntry storageEntry = (Storage.StorageEntry)jComboBox.getSelectedItem();
        this.dp.delete(storageEntry);
        defaultComboBoxModel.removeElement(storageEntry);
        if (av.lIlIIIIllll(defaultComboBoxModel.getSize())) {
            defaultComboBoxModel.setSelectedItem(defaultComboBoxModel.getElementAt(lIlllIlII[2]));
            0;
            if (3 != 3) {
                return;
            }
        } else {
            void lIlllIllIlllIll;
            lIlllIllIlllIll.setSelectedItem(null);
        }
        this.bH();
        this.bG();
    }

    private static void lIlIIIIlIlI() {
        lIlllIIll = new String[lIlllIlII[11]];
        av.lIlllIIll[av.lIlllIlII[2]] = av."Enabled";
        av.lIlllIIll[av.lIlllIlII[5]] = av."[Hotkey]";
        av.lIlllIIll[av.lIlllIlII[3]] = av."Copy gear";
        av.lIlllIIll[av.lIlllIlII[7]] = av."Save";
        av.lIlllIIll[av.lIlllIlII[8]] = av."Delete";
        av.lIlllIIll[av.lIlllIlII[4]] = av."[Hotkey]";
        av.lIlllIIll[av.lIlllIlII[9]] = av."Empty";
        av.lIlllIIll[av.lIlllIlII[10]] = av.".json";
    }

    /*
     * WARNING - void declaration
     */
    @Inject
    public av(GearLoadoutPlugin gearLoadoutPlugin, ItemManager itemManager, EventBus eventBus) {
        void var5_5;
        String string;
        void lIlllIlllIIllll;
        av lIlllIlllIlIIll;
        this.do = new DefaultComboBoxModel();
        this.dp = Storage.of(EquipmentSetup.class);
        this.dq = new HashMap<String, EquipmentSetup>();
        this.dw = new HashMap<EquipmentInventorySlot, JLabel>();
        this.dr = gearLoadoutPlugin;
        this.ds = itemManager;
        this.dt = eventBus;
        this.dy = EquipmentSetup.empty();
        this.dp.create();
        0;
        this.bI();
        this.setBorder(BorderFactory.createEmptyBorder(lIlllIlII[0], lIlllIlII[1], lIlllIlII[2], lIlllIlII[1]));
        this.setBackground(ColorScheme.DARK_GRAY_COLOR);
        this.setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = lIlllIlII[3];
        gridBagConstraints.gridx = lIlllIlII[2];
        gridBagConstraints.gridy = lIlllIlII[2];
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.0;
        gridBagConstraints.insets = new Insets(lIlllIlII[2], lIlllIlII[4], lIlllIlII[0], lIlllIlII[2]);
        gridBagConstraints.gridwidth = lIlllIlII[2];
        this.du = new JTextField();
        if (av.lIlIIIIllII(this.do.getSelectedItem())) {
            this.du.setText(this.do.getSelectedItem().toString());
        }
        JComboBox<Storage.StorageEntry> lIlllIlllIIlllI = new JComboBox<Storage.StorageEntry>(lIlllIlllIlIIll.do);
        lIlllIlllIIlllI.addActionListener(actionEvent -> {
            av lIlllIllIIllIlI;
            Storage.StorageEntry storageEntry = (Storage.StorageEntry)this.do.getSelectedItem();
            if (av.lIlIIIlIIII(storageEntry)) {
                this.dy = EquipmentSetup.empty();
                0;
                if ((6 ^ 2) == -1) {
                    return;
                }
            } else {
                void lIlllIllIIllIIl;
                lIlllIllIIllIlI.dy = lIlllIllIIllIlI.dq.computeIfAbsent(lIlllIllIIllIIl.getName(), arg_0 -> lIlllIllIIllIlI.a((Storage.StorageEntry)lIlllIllIIllIIl, arg_0));
            }
            if (av.lIlIIIlIIII(lIlllIllIIllIlI.dy.getCompositions())) {
                lIlllIllIIllIlI.dy.load(equipmentSetup -> SwingUtilities.invokeLater(this::bH));
                0;
                0;
                if (1 <= -1) {
                    return;
                }
            } else {
                SwingUtilities.invokeLater(lIlllIllIIllIlI::bH);
            }
        });
        lIlllIlllIlIIll.add(lIlllIlllIIlllI, lIlllIlllIIllll);
        lIlllIlllIIllll.gridy += lIlllIlII[5];
        lIlllIlllIlIIll.add(lIlllIlllIlIIll.bL(), lIlllIlllIIllll);
        lIlllIlllIIllll.gridy += lIlllIlII[5];
        lIlllIlllIlIIll.dx = new JCheckBox(lIlllIIll[lIlllIlII[2]]);
        lIlllIlllIlIIll.dx.addActionListener(actionEvent -> {
            this.dy.setActive(this.dx.isSelected());
            this.bK();
        });
        lIlllIlllIlIIll.add(lIlllIlllIlIIll.dx, lIlllIlllIIllll);
        lIlllIlllIIllll.gridy += lIlllIlII[5];
        lIlllIlllIlIIll.add(lIlllIlllIlIIll.du, lIlllIlllIIllll);
        lIlllIlllIIllll.gridy += lIlllIlII[5];
        lIlllIlllIIllll.gridwidth = lIlllIlII[5];
        if (av.lIlIIIIllIl(lIlllIlllIlIIll.dy.getHotkey(), lIlllIlII[6])) {
            string = lIlllIIll[lIlllIlII[5]];
            0;
            if (3 == 0) {
                throw null;
            }
        } else {
            string = KeyEvent.getKeyText(lIlllIlllIlIIll.dy.getHotkey());
        }
        lIlllIlllIlIIll.dv = new JButton(string);
        this.dv.addFocusListener(new aw(this));
        this.dv.addKeyListener(new ax(this));
        this.add(this.dv, gridBagConstraints);
        gridBagConstraints.gridx += lIlllIlII[5];
        JButton jButton = new JButton(lIlllIIll[lIlllIlII[3]]);
        jButton.addActionListener(actionEvent -> this.bJ());
        this.add(jButton, gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[2];
        gridBagConstraints.gridy += lIlllIlII[5];
        gridBagConstraints.gridwidth = lIlllIlII[2];
        JButton jButton2 = new JButton(lIlllIIll[lIlllIlII[7]]);
        jButton2.addActionListener(actionEvent -> this.bK());
        this.add(jButton2, gridBagConstraints);
        gridBagConstraints.gridy += lIlllIlII[5];
        JButton jButton3 = new JButton(lIlllIIll[lIlllIlII[8]]);
        jButton3.addActionListener(arg_0 -> this.a((JComboBox)var5_5, arg_0));
        this.add(jButton3, gridBagConstraints);
    }

    private JPanel bL() {
        JPanel jPanel = new JPanel();
        jPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        jPanel.setBorder(BorderFactory.createEmptyBorder(lIlllIlII[0], lIlllIlII[0], lIlllIlII[0], lIlllIlII[0]));
        GridBagLayout gridBagLayout = new GridBagLayout();
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        jPanel.setLayout(gridBagLayout);
        gridBagConstraints.fill = lIlllIlII[5];
        gridBagConstraints.gridx = lIlllIlII[5];
        gridBagConstraints.insets = new Insets(lIlllIlII[5], lIlllIlII[5], lIlllIlII[5], lIlllIlII[2]);
        jPanel.add((Component)this.a(EquipmentInventorySlot.HEAD), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[2];
        gridBagConstraints.gridy = lIlllIlII[5];
        jPanel.add((Component)this.a(EquipmentInventorySlot.CAPE), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[5];
        jPanel.add((Component)this.a(EquipmentInventorySlot.AMULET), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[3];
        jPanel.add((Component)this.a(EquipmentInventorySlot.AMMO), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[2];
        gridBagConstraints.gridy = lIlllIlII[3];
        jPanel.add((Component)this.a(EquipmentInventorySlot.WEAPON), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[5];
        jPanel.add((Component)this.a(EquipmentInventorySlot.BODY), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[3];
        jPanel.add((Component)this.a(EquipmentInventorySlot.SHIELD), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[5];
        gridBagConstraints.gridy = lIlllIlII[7];
        jPanel.add((Component)this.a(EquipmentInventorySlot.LEGS), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[2];
        gridBagConstraints.gridy = lIlllIlII[8];
        jPanel.add((Component)this.a(EquipmentInventorySlot.GLOVES), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[5];
        jPanel.add((Component)this.a(EquipmentInventorySlot.BOOTS), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[3];
        jPanel.add((Component)this.a(EquipmentInventorySlot.RING), gridBagConstraints);
        return jPanel;
    }

    private void bK() {
        String string = this.du.getText();
        Storage.StorageEntry storageEntry = (Storage.StorageEntry)this.do.getSelectedItem();
        if (av.lIlIIIIllII(storageEntry) && av.lIlIIIlIIIl(storageEntry.getName().equals(string) ? 1 : 0)) {
            this.dy = EquipmentSetup.get();
        }
        this.dy.load(equipmentSetup -> {
            Storage.StorageEntry storageEntry2 = this.dp.save((Object)this.dy, string);
            this.dq.put(string, this.dy);
            0;
            if (!av.lIlIIIIllII(storageEntry) || av.lIlIIIlIIIl(storageEntry.getName().equals(storageEntry2.getName()) ? 1 : 0)) {
                void lIlllIllIIlllIl;
                av lIlllIllIlIIIII;
                lIlllIllIlIIIII.do.addElement((Storage.StorageEntry)lIlllIllIIlllIl);
                lIlllIllIlIIIII.do.setSelectedItem(lIlllIllIIlllIl);
            }
            this.dr.c(this.dp.all());
            SwingUtilities.invokeLater(this::bH);
            this.bG();
        });
        0;
    }

    private static boolean lIlIIIIllIl(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlIIIIlIII(String lIlllIllIIIIIlI, String lIlllIllIIIIIll) {
        try {
            SecretKeySpec lIlllIllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIllIIIIIll.getBytes(StandardCharsets.UTF_8)), lIlllIlII[11]), "DES");
            Cipher lIlllIllIIIIllI = Cipher.getInstance("DES");
            lIlllIllIIIIllI.init(lIlllIlII[3], lIlllIllIIIIlll);
            return new String(lIlllIllIIIIllI.doFinal(Base64.getDecoder().decode(lIlllIllIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIllIIIIlIl) {
            lIlllIllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIlllI(int n2, int n3) {
        return n2 < n3;
    }

    /*
     * WARNING - void declaration
     */
    private void a(JLabel jLabel, EquipmentInventorySlot equipmentInventorySlot) {
        String string;
        void lIlllIllIlIIlll;
        av lIlllIllIlIlIIl;
        ItemComposition lIlllIllIlIIlIl;
        void lIlllIllIlIlIII;
        BufferedImage bufferedImage = this.dy.getImageForSlot(equipmentInventorySlot, this.ds);
        if (av.lIlIIIlIIlI(bufferedImage instanceof AsyncBufferedImage)) {
            ((AsyncBufferedImage)bufferedImage).addTo(jLabel);
            0;
            
            }
        } else {
            void lIlllIllIlIIllI;
            lIlllIllIlIlIII.setIcon(new ImageIcon((Image)lIlllIllIlIIllI));
        }
        if (av.lIlIIIlIIII(lIlllIllIlIIlIl = lIlllIllIlIlIIl.dy.getComposition((EquipmentInventorySlot)lIlllIllIlIIlll))) {
            string = lIlllIIll[lIlllIlII[9]];
            0;
            if (-1 > 2) {
                return;
            }
        } else {
            string = lIlllIllIlIIlIl.getName();
        }
        lIlllIllIlIlIII.setToolTipText(string);
    }

    private JLabel a(EquipmentInventorySlot equipmentInventorySlot) {
        JLabel jLabel = new JLabel();
        this.a(jLabel, equipmentInventorySlot);
        this.dw.put(equipmentInventorySlot, jLabel);
        0;
        return jLabel;
    }

    private static boolean lIlIIIlIIlI(int n2) {
        return n2 != 0;
    }

    private static String lIlIIIIIlll(String lIlllIlIllIllll, String lIlllIlIlllIIll) {
        lIlllIlIllIllll = new String(Base64.getDecoder().decode(lIlllIlIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lIlllIlIlllIIlI = new StringBuilder();
        char[] lIlllIlIlllIIIl = lIlllIlIlllIIll.toCharArray();
        int lIlllIlIlllIIII = lIlllIlII[2];
        char[] lIlllIlIllIlIlI = lIlllIlIllIllll.toCharArray();
        int lIlllIlIllIlIIl = lIlllIlIllIlIlI.length;
        int lIlllIlIllIlIII = lIlllIlII[2];
        while (av.lIlIIIIlllI(lIlllIlIllIlIII, lIlllIlIllIlIIl)) {
            char lIlllIlIlllIlIl = lIlllIlIllIlIlI[lIlllIlIllIlIII];
            lIlllIlIlllIIlI.append((char)(lIlllIlIlllIlIl ^ lIlllIlIlllIIIl[lIlllIlIlllIIII % lIlllIlIlllIIIl.length]));
            0;
            ++lIlllIlIlllIIII;
            ++lIlllIlIllIlIII;
            0;
            if (3 != 0) continue;
            return null;
        }
        return String.valueOf(lIlllIlIlllIIlI);
    }

    private static String lIlIIIIlIIl(String lIlllIllIIIllll, String lIlllIllIIlIIII) {
        try {
            SecretKeySpec lIlllIllIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIllIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIllIIlIIll = Cipher.getInstance("Blowfish");
            lIlllIllIIlIIll.init(lIlllIlII[3], lIlllIllIIlIlII);
            return new String(lIlllIllIIlIIll.doFinal(Base64.getDecoder().decode(lIlllIllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIllIIlIIlI) {
            lIlllIllIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIIII(Object object) {
        return object == null;
    }

    private /* synthetic */ EquipmentSetup a(Storage.StorageEntry storageEntry, String string) {
        return (EquipmentSetup)this.dp.parse(storageEntry);
    }

    private void bI() {
        Storage.StorageEntry storageEntry = (Storage.StorageEntry)this.do.getSelectedItem();
        List list = this.dp.getEntries(string -> string.endsWith(lIlllIIll[lIlllIlII[10]]));
        DefaultComboBoxModel<Storage.StorageEntry> defaultComboBoxModel = this.do;
        Objects.requireNonNull(defaultComboBoxModel);
        0;
        list.forEach(defaultComboBoxModel::addElement);
        this.dr.c(this.dp.all());
        this.do.setSelectedItem(storageEntry);
    }

    private static boolean lIlIIIIllll(int n2) {
        return n2 > 0;
    }

    private static boolean lIlIIIlIIIl(int n2) {
        return n2 == 0;
    }

    private /* synthetic */ void a(JComboBox jComboBox, ActionEvent actionEvent) {
        this.a(this.do, jComboBox);
    }

    private void bG() {
        this.dt.post((Object)new StorageChanged());
    }

    private void bJ() {
        int n2;
        if (av.lIlIIIlIIII(this.dy)) {
            n2 = lIlllIlII[6];
            0;
            if (-1 >= 1) {
                return;
            }
        } else {
            av lIlllIllIllIllI;
            n2 = lIlllIllIllIllI.dy.getHotkey();
        }
        int n3 = n2;
        this.dy = EquipmentSetup.get();
        this.dy.setHotkey(n3);
        this.dy.load(equipmentSetup -> SwingUtilities.invokeLater(this::bH));
        0;
    }

    static {
        av.lIlIIIIlIll();
        av.lIlIIIIlIlI();
    }

    /*
     * WARNING - void declaration
     */
    private void bH() {
        String string;
        av lIlllIlllIIIlIl;
        void lIlllIlllIIIIll;
        EquipmentInventorySlot[] equipmentInventorySlotArray = EquipmentInventorySlot.values();
        int n2 = equipmentInventorySlotArray.length;
        int lIlllIlllIIIIlI = lIlllIlII[2];
        while (av.lIlIIIIlllI(lIlllIlllIIIIlI, (int)lIlllIlllIIIIll)) {
            void lIlllIlllIIIlII;
            void lIlllIlllIIIIIl = lIlllIlllIIIlII[lIlllIlllIIIIlI];
            lIlllIlllIIIlIl.a(lIlllIlllIIIlIl.dw.get(lIlllIlllIIIIIl), (EquipmentInventorySlot)lIlllIlllIIIIIl);
            ++lIlllIlllIIIIlI;
            0;
            
            return;
        }
        JButton jButton = lIlllIlllIIIlIl.dv;
        if (av.lIlIIIIllIl(lIlllIlllIIIlIl.dy.getHotkey(), lIlllIlII[6])) {
            string = lIlllIIll[lIlllIlII[4]];
            0;
            if (1 < 0) {
                return;
            }
        } else {
            string = KeyEvent.getKeyText(lIlllIlllIIIlIl.dy.getHotkey());
        }
        jButton.setText(string);
        this.du.setText(this.do.getSelectedItem().toString());
        this.dx.setSelected(this.dy.isActive());
        this.revalidate();
    }
}

