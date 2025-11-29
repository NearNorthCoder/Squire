package i.i.b.s.c.q.r.s.s.p000.u.a.e;

import com.google.inject.Inject;
import gg.squire.basics.gearloadouts.GearLoadoutPlugin;
import gg.squire.client.util.Storage;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
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
/* renamed from: i.i.b.s.c.q.r.s.s.-.u.a.e.av  reason: invalid package and case insensitive filesystem */
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:i/i/b/s/c/q/r/s/s/-/u/a/e/av.class */
public class C0022av extends PluginPanel {
    private final /* synthetic */ EventBus dt;
    private final /* synthetic */ ItemManager ds;
    private final /* synthetic */ JCheckBox dx;
    final /* synthetic */ JButton dv;
    private static /* synthetic */ String[] lIlllIIll;
    /* synthetic */ boolean dz;
    private final /* synthetic */ GearLoadoutPlugin dr;
    private final /* synthetic */ JTextField du;
    private static /* synthetic */ int[] lIlllIlII;

    /* renamed from: do  reason: not valid java name */
    private final /* synthetic */ DefaultComboBoxModel<Storage.StorageEntry> f0do = new DefaultComboBoxModel<>();
    private final /* synthetic */ Storage<EquipmentSetup> dp = Storage.of(EquipmentSetup.class);
    private final /* synthetic */ Map<String, EquipmentSetup> dq = new HashMap();
    private final /* synthetic */ Map<EquipmentInventorySlot, JLabel> dw = new HashMap();
    /* synthetic */ EquipmentSetup dy = EquipmentSetup.empty();

    private static boolean lIlIIIIllII(Object obj) {
        return obj != null;
    }

    private static void lIlIIIIlIll() {
        lIlllIlII = new int[12];
        lIlllIlII[0] = (((115 + 57) - 94) + 108) ^ (((17 + 161) - 172) + 170);
        lIlllIlII[1] = (44 ^ 111) ^ (242 ^ 168);
        lIlllIlII[2] = ((33 ^ 91) ^ (187 ^ 199)) & (((((39 + 110) - 143) + 145) ^ (((115 + 136) - 202) + 96)) ^ (-" ".length()));
        lIlllIlII[3] = "  ".length();
        lIlllIlII[4] = (123 ^ 86) ^ (82 ^ 122);
        lIlllIlII[5] = " ".length();
        lIlllIlII[6] = -" ".length();
        lIlllIlII[7] = "   ".length();
        lIlllIlII[8] = 133 ^ 129;
        lIlllIlII[9] = (((111 + 43) - 40) + 35) ^ (((25 + 127) - 141) + 136);
        lIlllIlII[10] = 23 ^ 16;
        lIlllIlII[11] = 48 ^ 56;
    }

    private void a(DefaultComboBoxModel<Storage.StorageEntry> defaultComboBoxModel, JComboBox<Storage.StorageEntry> jComboBox) {
        Storage.StorageEntry storageEntry = (Storage.StorageEntry) jComboBox.getSelectedItem();
        this.dp.delete(storageEntry);
        defaultComboBoxModel.removeElement(storageEntry);
        if (lIlIIIIllll(defaultComboBoxModel.getSize())) {
            defaultComboBoxModel.setSelectedItem(defaultComboBoxModel.getElementAt(lIlllIlII[2]));
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        } else {
            defaultComboBoxModel.setSelectedItem((Object) null);
        }
        bH();
        bG();
    }

    private static void lIlIIIIlIlI() {
        lIlllIIll = new String[lIlllIlII[11]];
        lIlllIIll[lIlllIlII[2]] = lIlIIIIIlll("Ayk4AwIjIw==", "FGYan");
        lIlllIIll[lIlllIlII[5]] = lIlIIIIlIII("Bv10pUQ84o+hnAPC1ZcU9g==", "hQisV");
        lIlllIIll[lIlllIlII[3]] = lIlIIIIIlll("JSMhDlQBKTAF", "fLQwt");
        lIlllIIll[lIlllIlII[7]] = lIlIIIIIlll("CS8MMQ==", "ZNzTn");
        lIlllIIll[lIlllIlII[8]] = lIlIIIIlIIl("LBvxBjByEPw=", "hPxoV");
        lIlllIIll[lIlllIlII[4]] = lIlIIIIIlll("IQ84BB8fPgo=", "zGWpt");
        lIlllIIll[lIlllIlII[9]] = lIlIIIIIlll("MDcDLgg=", "uZsZq");
        lIlllIIll[lIlllIlII[10]] = lIlIIIIlIIl("eLMjJyr8tDg=", "vKPbw");
    }

    @Inject
    public C0022av(GearLoadoutPlugin gearLoadoutPlugin, ItemManager itemManager, EventBus eventBus) {
        String keyText;
        this.dr = gearLoadoutPlugin;
        this.ds = itemManager;
        this.dt = eventBus;
        this.dp.create();
        "".length();
        bI();
        setBorder(BorderFactory.createEmptyBorder(lIlllIlII[0], lIlllIlII[1], lIlllIlII[2], lIlllIlII[1]));
        setBackground(ColorScheme.DARK_GRAY_COLOR);
        setLayout(new GridBagLayout());
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.fill = lIlllIlII[3];
        gridBagConstraints.gridx = lIlllIlII[2];
        gridBagConstraints.gridy = lIlllIlII[2];
        gridBagConstraints.weightx = 1.0d;
        gridBagConstraints.weighty = 0.0d;
        gridBagConstraints.insets = new Insets(lIlllIlII[2], lIlllIlII[4], lIlllIlII[0], lIlllIlII[2]);
        gridBagConstraints.gridwidth = lIlllIlII[2];
        this.du = new JTextField();
        if (lIlIIIIllII(this.f0do.getSelectedItem())) {
            this.du.setText(this.f0do.getSelectedItem().toString());
        }
        Component jComboBox = new JComboBox(this.f0do);
        jComboBox.addActionListener(actionEvent -> {
            Storage.StorageEntry storageEntry = (Storage.StorageEntry) this.f0do.getSelectedItem();
            if (lIlIIIlIIII(storageEntry)) {
                this.dy = EquipmentSetup.empty();
                "".length();
                if ((6 ^ 2) == (-" ".length())) {
                    return;
                }
            } else {
                this.dy = this.dq.computeIfAbsent(storageEntry.getName(), str -> {
                    return (EquipmentSetup) this.dp.parse(storageEntry);
                });
            }
            if (!lIlIIIlIIII(this.dy.getCompositions())) {
                SwingUtilities.invokeLater(this::bH);
                return;
            }
            this.dy.load(equipmentSetup -> {
                SwingUtilities.invokeLater(this::bH);
            });
            "".length();
            "".length();
            if (" ".length() <= (-" ".length())) {
            }
        });
        add(jComboBox, gridBagConstraints);
        gridBagConstraints.gridy += lIlllIlII[5];
        add(bL(), gridBagConstraints);
        gridBagConstraints.gridy += lIlllIlII[5];
        this.dx = new JCheckBox(lIlllIIll[lIlllIlII[2]]);
        this.dx.addActionListener(actionEvent2 -> {
            this.dy.setActive(this.dx.isSelected());
            bK();
        });
        add(this.dx, gridBagConstraints);
        gridBagConstraints.gridy += lIlllIlII[5];
        add(this.du, gridBagConstraints);
        gridBagConstraints.gridy += lIlllIlII[5];
        gridBagConstraints.gridwidth = lIlllIlII[5];
        if (lIlIIIIllIl(this.dy.getHotkey(), lIlllIlII[6])) {
            keyText = lIlllIIll[lIlllIlII[5]];
            "".length();
            if ("   ".length() == 0) {
                throw null;
            }
        } else {
            keyText = KeyEvent.getKeyText(this.dy.getHotkey());
        }
        this.dv = new JButton(keyText);
        this.dv.addFocusListener(new C0023aw(this));
        this.dv.addKeyListener(new C0024ax(this));
        add(this.dv, gridBagConstraints);
        gridBagConstraints.gridx += lIlllIlII[5];
        Component jButton = new JButton(lIlllIIll[lIlllIlII[3]]);
        jButton.addActionListener(actionEvent3 -> {
            bJ();
        });
        add(jButton, gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[2];
        gridBagConstraints.gridy += lIlllIlII[5];
        gridBagConstraints.gridwidth = lIlllIlII[2];
        Component jButton2 = new JButton(lIlllIIll[lIlllIlII[7]]);
        jButton2.addActionListener(actionEvent4 -> {
            bK();
        });
        add(jButton2, gridBagConstraints);
        gridBagConstraints.gridy += lIlllIlII[5];
        Component jButton3 = new JButton(lIlllIIll[lIlllIlII[8]]);
        jButton3.addActionListener(actionEvent5 -> {
            a(this.f0do, jComboBox);
        });
        add(jButton3, gridBagConstraints);
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
        jPanel.add(a(EquipmentInventorySlot.HEAD), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[2];
        gridBagConstraints.gridy = lIlllIlII[5];
        jPanel.add(a(EquipmentInventorySlot.CAPE), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[5];
        jPanel.add(a(EquipmentInventorySlot.AMULET), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[3];
        jPanel.add(a(EquipmentInventorySlot.AMMO), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[2];
        gridBagConstraints.gridy = lIlllIlII[3];
        jPanel.add(a(EquipmentInventorySlot.WEAPON), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[5];
        jPanel.add(a(EquipmentInventorySlot.BODY), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[3];
        jPanel.add(a(EquipmentInventorySlot.SHIELD), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[5];
        gridBagConstraints.gridy = lIlllIlII[7];
        jPanel.add(a(EquipmentInventorySlot.LEGS), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[2];
        gridBagConstraints.gridy = lIlllIlII[8];
        jPanel.add(a(EquipmentInventorySlot.GLOVES), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[5];
        jPanel.add(a(EquipmentInventorySlot.BOOTS), gridBagConstraints);
        gridBagConstraints.gridx = lIlllIlII[3];
        jPanel.add(a(EquipmentInventorySlot.RING), gridBagConstraints);
        return jPanel;
    }

    private void bK() {
        String text = this.du.getText();
        Storage.StorageEntry storageEntry = (Storage.StorageEntry) this.f0do.getSelectedItem();
        if (lIlIIIIllII(storageEntry) && lIlIIIlIIIl(storageEntry.getName().equals(text) ? 1 : 0)) {
            this.dy = EquipmentSetup.get();
        }
        this.dy.load(equipmentSetup -> {
            Storage.StorageEntry save = this.dp.save(this.dy, text);
            this.dq.put(text, this.dy);
            "".length();
            if (!lIlIIIIllII(storageEntry) || lIlIIIlIIIl(storageEntry.getName().equals(save.getName()) ? 1 : 0)) {
                this.f0do.addElement(save);
                this.f0do.setSelectedItem(save);
            }
            this.dr.c(this.dp.all());
            SwingUtilities.invokeLater(this::bH);
            bG();
        });
        "".length();
    }

    private static boolean lIlIIIIllIl(int i2, int i3) {
        return i2 == i3;
    }

    private static String lIlIIIIlIII(String lIlllIllIIIIlII, String lIlllIllIIIIIll) {
        try {
            SecretKeySpec lIlllIllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lIlllIllIIIIIll.getBytes(StandardCharsets.UTF_8)), lIlllIlII[11]), "DES");
            Cipher lIlllIllIIIIllI = Cipher.getInstance("DES");
            lIlllIllIIIIllI.init(lIlllIlII[3], lIlllIllIIIIlll);
            return new String(lIlllIllIIIIllI.doFinal(Base64.getDecoder().decode(lIlllIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIllIIIIlIl) {
            lIlllIllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIIlllI(int i2, int i3) {
        return i2 < i3;
    }

    private void a(JLabel jLabel, EquipmentInventorySlot equipmentInventorySlot) {
        String name;
        AsyncBufferedImage imageForSlot = this.dy.getImageForSlot(equipmentInventorySlot, this.ds);
        if (lIlIIIlIIlI(imageForSlot instanceof AsyncBufferedImage ? 1 : 0)) {
            imageForSlot.addTo(jLabel);
            "".length();
            if (0 != 0) {
                return;
            }
        } else {
            jLabel.setIcon(new ImageIcon(imageForSlot));
        }
        ItemComposition composition = this.dy.getComposition(equipmentInventorySlot);
        if (lIlIIIlIIII(composition)) {
            name = lIlllIIll[lIlllIlII[9]];
            "".length();
            if ((-" ".length()) > "  ".length()) {
                return;
            }
        } else {
            name = composition.getName();
        }
        jLabel.setToolTipText(name);
    }

    private JLabel a(EquipmentInventorySlot equipmentInventorySlot) {
        JLabel jLabel = new JLabel();
        a(jLabel, equipmentInventorySlot);
        this.dw.put(equipmentInventorySlot, jLabel);
        "".length();
        return jLabel;
    }

    private static boolean lIlIIIlIIlI(int i2) {
        return i2 != 0;
    }

    private static String lIlIIIIIlll(String lIlllIlIlllIlII, String lIlllIlIlllIIll) {
        String lIlllIlIlllIlII2 = new String(Base64.getDecoder().decode(lIlllIlIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lIlllIlIlllIIIl = lIlllIlIlllIIll.toCharArray();
        int lIlllIlIlllIIII = lIlllIlII[2];
        char[] charArray = lIlllIlIlllIlII2.toCharArray();
        int length = charArray.length;
        int i2 = lIlllIlII[2];
        while (lIlIIIIlllI(i2, length)) {
            char lIlllIlIllIIlll = charArray[i2];
            sb.append((char) (lIlllIlIllIIlll ^ lIlllIlIlllIIIl[lIlllIlIlllIIII % lIlllIlIlllIIIl.length]));
            "".length();
            lIlllIlIlllIIII++;
            i2++;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static String lIlIIIIlIIl(String lIlllIllIIlIIIl, String lIlllIllIIlIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lIlllIllIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lIlllIllIIlIIll = Cipher.getInstance("Blowfish");
            lIlllIllIIlIIll.init(lIlllIlII[3], secretKeySpec);
            return new String(lIlllIllIIlIIll.doFinal(Base64.getDecoder().decode(lIlllIllIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lIlllIllIIlIIlI) {
            lIlllIllIIlIIlI.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIIIlIIII(Object obj) {
        return obj == null;
    }

    private void bI() {
        Storage.StorageEntry storageEntry = (Storage.StorageEntry) this.f0do.getSelectedItem();
        List entries = this.dp.getEntries(str -> {
            return str.endsWith(lIlllIIll[lIlllIlII[10]]);
        });
        DefaultComboBoxModel<Storage.StorageEntry> defaultComboBoxModel = this.f0do;
        Objects.requireNonNull(defaultComboBoxModel);
        "".length();
        entries.forEach((v1) -> {
            r1.addElement(v1);
        });
        this.dr.c(this.dp.all());
        this.f0do.setSelectedItem(storageEntry);
    }

    private static boolean lIlIIIIllll(int i2) {
        return i2 > 0;
    }

    private static boolean lIlIIIlIIIl(int i2) {
        return i2 == 0;
    }

    private void bG() {
        this.dt.post(new StorageChanged());
    }

    private void bJ() {
        int hotkey;
        if (lIlIIIlIIII(this.dy)) {
            hotkey = lIlllIlII[6];
            "".length();
            if ((-" ".length()) >= " ".length()) {
                return;
            }
        } else {
            hotkey = this.dy.getHotkey();
        }
        this.dy = EquipmentSetup.get();
        this.dy.setHotkey(hotkey);
        this.dy.load(equipmentSetup -> {
            SwingUtilities.invokeLater(this::bH);
        });
        "".length();
    }

    static {
        lIlIIIIlIll();
        lIlIIIIlIlI();
    }

    private void bH() {
        String keyText;
        EquipmentInventorySlot[] values = EquipmentInventorySlot.values();
        int length = values.length;
        int i2 = lIlllIlII[2];
        while (lIlIIIIlllI(i2, length)) {
            EquipmentInventorySlot equipmentInventorySlot = values[i2];
            a(this.dw.get(equipmentInventorySlot), equipmentInventorySlot);
            i2++;
            "".length();
            if (0 != 0) {
                return;
            }
        }
        JButton jButton = this.dv;
        if (lIlIIIIllIl(this.dy.getHotkey(), lIlllIlII[6])) {
            keyText = lIlllIIll[lIlllIlII[4]];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        } else {
            keyText = KeyEvent.getKeyText(this.dy.getHotkey());
        }
        jButton.setText(keyText);
        this.du.setText(this.f0do.getSelectedItem().toString());
        this.dx.setSelected(this.dy.isActive());
        revalidate();
    }
}
