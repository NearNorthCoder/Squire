/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.Task
 *  net.runelite.api.Client
 *  net.runelite.api.Item
 *  net.runelite.api.MenuAction
 *  net.runelite.api.MenuEntry
 *  net.runelite.api.NPC
 *  net.runelite.api.events.MenuOptionClicked
 *  net.runelite.api.util.Text
 *  net.runelite.client.config.ConfigStorageBox
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.unethicalite.api.entities.NPCs
 *  net.unethicalite.api.game.Combat
 *  net.unethicalite.api.game.Gear
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.magic.SpellBook$Ancient
 *  net.unethicalite.client.Static
 */
package -.r.u.q.e.s.o.t.a.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.Item;
import net.runelite.api.MenuAction;
import net.runelite.api.MenuEntry;
import net.runelite.api.NPC;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.util.Text;
import net.runelite.client.config.ConfigStorageBox;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Gear;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;

public abstract class y_Unknown
extends Task {
    private /* synthetic */ int aP;
    private /* synthetic */ Spell aO;
    protected final /* synthetic */ TOAConfig aL;
    private /* synthetic */ int aQ;
    private /* synthetic */ boolean aN;
    private final /* synthetic */ ExecutorService aM;
    private static /* synthetic */ String[] lIlIIIIIIlIIl;
    private static /* synthetic */ int[] lIlIIIIIIlIlI;

    private static void lIllIlIlllIlIll() {
        lIlIIIIIIlIIl = new String[lIlIIIIIIlIlI[14]];
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[0]] = y."Wield";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[2]] = y."Wear";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[3]] = y."Equip";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[1]] = y.",";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[5]] = y."Cast";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[6]] = y."Attack";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[7]] = y."\\(.*?\\)";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[8]] = y."";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[9]] = y."Wield";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[10]] = y."Wear";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[11]] = y."Equip";
    }

    private static String lIllIlIlllIlIIl(String var24, String var20) {
        var24 = new String(Base64.getDecoder().decode(var24.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var5 = new StringBuilder();
        char[] var31 = var20.toCharArray();
        int var7 = lIlIIIIIIlIlI[0];
        char[] var35 = var24.toCharArray();
        int var14 = var35.length;
        int var9 = lIlIIIIIIlIlI[0];
        while (y.lIllIlIllllIllI(var9, var14)) {
            char var8 = var35[var9];
            var5.append((char)(var8 ^ var31[var7 % var31.length]));
            0;
            ++var7;
            ++var9;
            0;
            if (2 > -1) continue;
            return null;
        }
        return String.valueOf(var5);
    }

    public void a(Spell spell) {
        this.aO = spell;
    }

    private static String lIllIlIlllIlIII(String var2, String var11) {
        try {
            SecretKeySpec var23 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var11.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var32 = Cipher.getInstance("Blowfish");
            var32.init(lIlIIIIIIlIlI[3], var23);
            return new String(var32.doFinal(Base64.getDecoder().decode(var2.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var10) {
            var10.printStackTrace();
            return null;
        }
    }

    public abstract boolean C();

    public abstract int[] a(String var1);

    private static boolean lIllIlIllllIIlI(Object object) {
        return object != null;
    }

    static {
        y.lIllIlIlllIllII();
        y.lIllIlIlllIlIll();
    }

    private static boolean lIllIlIllllIIII(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox, ConfigStorageBox<EquipmentSetup> configStorageBox2, int n2) {
        void var27;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (y.lIllIlIlllIllIl(equipmentSetup)) {
            return ((EquipmentSetup)configStorageBox2.selected(EquipmentSetup.class)).getIds();
        }
        if (y.lIllIlIllllIIII(Vars.getBit((int)lIlIIIIIIlIlI[4]), lIlIIIIIIlIlI[2])) {
            var27 /= lIlIIIIIIlIlI[3];
        }
        if (y.lIllIlIllllIIIl(Combat.getSpecEnergy(), (int)var27)) {
            void var34;
            y var26;
            var26.B();
            return var34.getIds();
        }
        return ((EquipmentSetup)configStorageBox2.selected(EquipmentSetup.class)).getIds();
    }

    public void c(int n2) {
        int[] nArray = new int[lIlIIIIIIlIlI[2]];
        nArray[y.lIlIIIIIIlIlI[0]] = n2;
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (y.lIllIlIlllIllIl(nPC)) {
            return;
        }
        this.aQ = nPC.getIndex();
    }

    private int[] A() {
        EquipmentSetup equipmentSetup = (EquipmentSetup)this.aL.barrage().selected(EquipmentSetup.class);
        if (y.lIllIlIlllIllIl(equipmentSetup)) {
            return new int[lIlIIIIIIlIlI[0]];
        }
        return equipmentSetup.getIds();
    }

    public void a(MenuEntry menuEntry) {
        int[] nArray = this.A();
        Client client = Static.getClient();
        this.aM.submit(() -> {
            this.b(nArray);
            client.interact(menuEntry.getIdentifier(), menuEntry.getType().getId(), menuEntry.getParam0(), menuEntry.getParam1());
        });
        0;
    }

    public boolean run() {
        return lIlIIIIIIlIlI[0];
    }

    public void B() {
        this.aN = lIlIIIIIIlIlI[2];
    }

    private static boolean lIllIlIllllIIll(int n2, int n3) {
        return n2 <= n3;
    }

    private static boolean lIllIlIllllIlIl(int n2) {
        return n2 == 0;
    }

    private static boolean lIllIlIllllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIllIlIllllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIllIlIllllIlII(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        void var4_5;
        y var25;
        void var4;
        void var19;
        int n2 = Static.getClient().getGameCycle();
        if (y.lIllIlIllllIIll(n2 - this.aP, lIlIIIIIIlIlI[2])) {
            return;
        }
        var25.aP = var19;
        if (y.lIllIlIlllIlllI(var4.getMenuOption().contains(lIlIIIIIIlIIl[lIlIIIIIIlIlI[5]]) ? 1 : 0) && y.lIllIlIllllIlII(SpellBook.getCurrent(), SpellBook.ANCIENT)) {
            var25.b((MenuOptionClicked)var4);
            return;
        }
        if (y.lIllIlIllllIlIl(var4.getMenuOption().contains(lIlIIIIIIlIIl[lIlIIIIIIlIlI[6]]) ? 1 : 0)) {
            return;
        }
        Object var3 = SpellBook.Ancient.values();
        int llllllllllllllIlllIIllIllIIlIlll22 = ((SpellBook.Ancient[])var3).length;
        int var30 = lIlIIIIIIlIlI[0];
        while (y.lIllIlIllllIllI(var30, llllllllllllllIlllIIllIllIIlIlll22)) {
            SpellBook.Ancient var6 = var3[var30];
            if (y.lIllIlIlllIlllI(Magic.isSpellSelected((Spell)var6) ? 1 : 0)) {
                return;
            }
            ++var30;
            0;
            if ((0x51 ^ 4 ^ (0xD9 ^ 0x88)) > 0) continue;
            return;
        }
        if (y.lIllIlIlllIlllI(Combat.isSpecEnabled() ? 1 : 0)) {
            return;
        }
        var3 = Text.removeTags((String)var4.getMenuTarget()).replaceAll(lIlIIIIIIlIIl[lIlIIIIIIlIlI[7]], lIlIIIIIIlIIl[lIlIIIIIIlIlI[8]]).trim();
        int[] llllllllllllllIlllIIllIllIIlIlll22 = var25.a((String)var3);
        if (y.lIllIlIllllIlIl(llllllllllllllIlllIIllIllIIlIlll22.length)) {
            return;
        }
        menuOptionClicked.setConsumed(lIlIIIIIIlIlI[2]);
        this.a((int[])var4_5, menuOptionClicked.getMenuEntry());
    }

    private static String lIllIlIlllIlIlI(String var18, String var28) {
        try {
            SecretKeySpec var17 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var28.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIlIlI[9]), "DES");
            Cipher var21 = Cipher.getInstance("DES");
            var21.init(lIlIIIIIIlIlI[3], var17);
            return new String(var21.doFinal(Base64.getDecoder().decode(var18.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var12) {
            var12.printStackTrace();
            return null;
        }
    }

    public void b(int[] nArray) {
        Iterator var1 = Inventory.getAll((int[])nArray).stream().filter(item -> {
            String[] stringArray = new String[lIlIIIIIIlIlI[1]];
            stringArray[y.lIlIIIIIIlIlI[0]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[9]];
            stringArray[y.lIlIIIIIIlIlI[2]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[10]];
            stringArray[y.lIlIIIIIIlIlI[3]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[11]];
            return item.hasAction(stringArray);
        }).collect(Collectors.toList()).iterator();
        while (y.lIllIlIlllIlllI(var1.hasNext() ? 1 : 0)) {
            y var33;
            Item var13 = (Item)var1.next();
            String[] stringArray = new String[lIlIIIIIIlIlI[1]];
            stringArray[y.lIlIIIIIIlIlI[0]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[0]];
            stringArray[y.lIlIIIIIIlIlI[2]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[2]];
            stringArray[y.lIlIIIIIIlIlI[3]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[3]];
            var13.interact(stringArray);
            if (y.lIllIlIlllIllll(var33.aL.gearSwapDelay())) {
                try {
                    Thread.sleep(var33.aL.gearSwapDelay());
                    0;
                }
                catch (InterruptedException llllllllllllllIlllIIllIllIllIlll) {
                    // empty catch block
                }
                if (-1 >= 0) {
                    return;
                }
            }
            0;
            if (((0x2C ^ 0x29) & ~(0x37 ^ 0x32)) < 1) continue;
            return;
        }
        Gear.swapTo((int[])nArray);
        0;
    }

    protected void b(MenuOptionClicked menuOptionClicked) {
    }

    private static boolean lIllIlIllllIlll(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIllIlIlllIlllI(int n2) {
        return n2 != 0;
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (y.lIllIlIllllIIlI(equipmentSetup)) {
            nArray = equipmentSetup.getIds();
            0;
            if (((0xDB ^ 0x9D) & ~(0x27 ^ 0x61)) > 0) {
                return null;
            }
        } else {
            nArray = new int[lIlIIIIIIlIlI[0]];
        }
        return nArray;
    }

    public y(TOAConfig tOAConfig, ExecutorService executorService) {
        this.aL = tOAConfig;
        this.aM = executorService;
    }

    public void a(int[] nArray, MenuEntry menuEntry) {
        this.aM.submit(() -> {
            void var4_4;
            void var5_5;
            int n2;
            y var15;
            void var22;
            Client client = Static.getClient();
            this.b(nArray);
            if (y.lIllIlIlllIlllI(this.aN ? 1 : 0)) {
                this.aN = lIlIIIIIIlIlI[0];
                if (y.lIllIlIllllIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
                    Combat.toggleSpec();
                }
            }
            int var29 = var22.getType().getId();
            if (y.lIllIlIllllIIlI(var15.aO)) {
                Magic.selectSpell((Spell)var15.aO);
                var29 = MenuAction.WIDGET_TARGET_ON_NPC.getId();
                var15.aO = null;
            }
            if (y.lIllIlIllllIlll(var15.aQ, lIlIIIIIIlIlI[12])) {
                n2 = var15.aQ;
                0;
                if (-2 > 0) {
                    return;
                }
            } else {
                int var16;
                n2 = var16 = var22.getIdentifier();
            }
            if ((!y.lIllIlIllllIIIl(var29, lIlIIIIIIlIlI[10]) || y.lIllIlIlllllIII(var29, lIlIIIIIIlIlI[13])) && y.lIllIlIllllIlll(var29, MenuAction.WIDGET_TARGET_ON_NPC.getId())) {
                var29 = MenuAction.NPC_SECOND_OPTION.getId();
            }
            client.interact((int)var5_5, (int)var4_4, menuEntry.getParam0(), menuEntry.getParam1());
            this.aQ = lIlIIIIIIlIlI[12];
        });
        0;
    }

    private static boolean lIllIlIlllIllIl(Object object) {
        return object == null;
    }

    private int[] b(String string) {
        return Stream.of(string.split(lIlIIIIIIlIIl[lIlIIIIIIlIlI[1]])).mapToInt(Integer::parseInt).toArray();
    }

    private static boolean lIllIlIlllIllll(int n2) {
        return n2 > 0;
    }

    private static void lIllIlIlllIllII() {
        lIlIIIIIIlIlI = new int[15];
        y.lIlIIIIIIlIlI[0] = (0x30 ^ 0x7E) & ~(0xD6 ^ 0x98);
        y.lIlIIIIIIlIlI[1] = 3;
        y.lIlIIIIIIlIlI[2] = 1;
        y.lIlIIIIIIlIlI[3] = 2;
        y.lIlIIIIIIlIlI[4] = -(0xFFFFACF7 & 0x57AF) & (0xFFFFFFBF & 0x3CFF);
        y.lIlIIIIIIlIlI[5] = 0x38 ^ 0x3C;
        y.lIlIIIIIIlIlI[6] = 0xC ^ 9;
        y.lIlIIIIIIlIlI[7] = 0x62 ^ 0x64;
        y.lIlIIIIIIlIlI[8] = 0x7C ^ 0x4B ^ (0x61 ^ 0x51);
        y.lIlIIIIIIlIlI[9] = 0xF5 ^ 0xBC ^ (0x20 ^ 0x61);
        y.lIlIIIIIIlIlI[10] = 24 + 23 - -60 + 39 ^ 27 + 101 - 119 + 146;
        y.lIlIIIIIIlIlI[11] = 0x24 ^ 0x5C ^ (0xDA ^ 0xA8);
        y.lIlIIIIIIlIlI[12] = -1;
        y.lIlIIIIIIlIlI[13] = 0x7F ^ 0x5B ^ (0x72 ^ 0x5B);
        y.lIlIIIIIIlIlI[14] = 97 + 32 - -56 + 22 ^ 9 + 94 - 16 + 109;
    }

    private static boolean lIllIlIlllllIII(int n2, int n3) {
        return n2 > n3;
    }
}

