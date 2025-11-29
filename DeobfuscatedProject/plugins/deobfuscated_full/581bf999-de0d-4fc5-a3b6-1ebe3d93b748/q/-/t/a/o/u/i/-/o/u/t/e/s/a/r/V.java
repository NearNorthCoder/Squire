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
 *  net.unethicalite.api.game.Vars
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.api.magic.Magic
 *  net.unethicalite.api.magic.Spell
 *  net.unethicalite.api.magic.SpellBook
 *  net.unethicalite.api.magic.SpellBook$Ancient
 *  net.unethicalite.client.Static
 */
package q.-.t.a.o.u.i.-.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.Task;
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
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;

public abstract class V
extends Task {
    private final /* synthetic */ ExecutorService cg;
    private /* synthetic */ boolean ch;
    private /* synthetic */ int ck;
    private /* synthetic */ int cj;
    private /* synthetic */ Spell ci;
    private static /* synthetic */ String[] llIIIlIllIl;
    private static /* synthetic */ int[] llIIIllIIIl;
    protected final /* synthetic */ TOAConfig cf;

    private static boolean lIIllllIllIlII(Object object, Object object2) {
        return object == object2;
    }

    private static void lIIllllIIllllI() {
        llIIIlIllIl = new String[llIIIllIIIl[14]];
        V.llIIIlIllIl[V.llIIIllIIIl[1]] = V."Wield";
        V.llIIIlIllIl[V.llIIIllIIIl[2]] = V."Wear";
        V.llIIIlIllIl[V.llIIIllIIIl[3]] = V."Equip";
        V.llIIIlIllIl[V.llIIIllIIIl[0]] = V.",";
        V.llIIIlIllIl[V.llIIIllIIIl[5]] = V."Cast";
        V.llIIIlIllIl[V.llIIIllIIIl[6]] = V."Attack";
        V.llIIIlIllIl[V.llIIIllIIIl[7]] = V."\\(.*?\\)";
        V.llIIIlIllIl[V.llIIIllIIIl[8]] = V."";
        V.llIIIlIllIl[V.llIIIllIIIl[9]] = V."Wield";
        V.llIIIlIllIl[V.llIIIllIIIl[10]] = V."Wear";
        V.llIIIlIllIl[V.llIIIllIIIl[11]] = V."Equip";
    }

    private static String lIIllllIIlllIl(String var23, String var13) {
        try {
            SecretKeySpec var5 = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(var13.getBytes(StandardCharsets.UTF_8)), llIIIllIIIl[9]), "DES");
            Cipher var10 = Cipher.getInstance("DES");
            var10.init(llIIIllIIIl[3], var5);
            return new String(var10.doFinal(Base64.getDecoder().decode(var23.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var17) {
            var17.printStackTrace();
            return null;
        }
    }

    public boolean run() {
        return llIIIllIIIl[1];
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        void var4_5;
        V var3;
        void var16;
        void var11;
        int n2 = Static.getClient().getGameCycle();
        if (V.lIIllllIllIIll(n2 - this.cj, llIIIllIIIl[2])) {
            return;
        }
        var3.cj = var11;
        if (V.lIIllllIlIlllI(var16.getMenuOption().contains(llIIIlIllIl[llIIIllIIIl[5]]) ? 1 : 0) && V.lIIllllIllIlII(SpellBook.getCurrent(), SpellBook.ANCIENT)) {
            var3.b((MenuOptionClicked)var16);
            return;
        }
        if (V.lIIllllIllIlIl(var16.getMenuOption().contains(llIIIlIllIl[llIIIllIIIl[6]]) ? 1 : 0)) {
            return;
        }
        Object var31 = SpellBook.Ancient.values();
        int llllllllllllllllIlIIIIllllIlIIIl22 = ((SpellBook.Ancient[])var31).length;
        int var28 = llIIIllIIIl[1];
        while (V.lIIllllIllIllI(var28, llllllllllllllllIlIIIIllllIlIIIl22)) {
            SpellBook.Ancient var22 = var31[var28];
            if (V.lIIllllIlIlllI(Magic.isSpellSelected((Spell)var22) ? 1 : 0)) {
                return;
            }
            ++var28;
            0;
            if (3 <= 3) continue;
            return;
        }
        if (V.lIIllllIlIlllI(Combat.isSpecEnabled() ? 1 : 0)) {
            return;
        }
        var31 = Text.removeTags((String)var16.getMenuTarget()).replaceAll(llIIIlIllIl[llIIIllIIIl[7]], llIIIlIllIl[llIIIllIIIl[8]]).trim();
        int[] llllllllllllllllIlIIIIllllIlIIIl22 = var3.j((String)var31);
        if (V.lIIllllIllIlIl(llllllllllllllllIlIIIIllllIlIIIl22.length)) {
            return;
        }
        menuOptionClicked.setConsumed(llIIIllIIIl[2]);
        this.a((int[])var4_5, menuOptionClicked.getMenuEntry());
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        int[] nArray;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (V.lIIllllIllIIlI(equipmentSetup)) {
            nArray = equipmentSetup.getIds();
            0;
            if (((72 + 64 - 51 + 60 ^ 102 + 83 - 157 + 150) & (115 + 39 - 30 + 44 ^ 39 + 44 - 7 + 63 ^ -1)) != 0) {
                return null;
            }
        } else {
            nArray = new int[llIIIllIIIl[1]];
        }
        return nArray;
    }

    private static boolean lIIllllIllIIIl(int n2, int n3) {
        return n2 >= n3;
    }

    private static boolean lIIllllIllIIII(int n2, int n3) {
        return n2 == n3;
    }

    private static boolean lIIllllIlllIII(int n2, int n3) {
        return n2 > n3;
    }

    private static boolean lIIllllIllIllI(int n2, int n3) {
        return n2 < n3;
    }

    private static boolean lIIllllIllIlll(int n2, int n3) {
        return n2 != n3;
    }

    public abstract boolean aL();

    private static String lIIllllIIlllII(String var8, String var7) {
        var8 = new String(Base64.getDecoder().decode(var8.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder var12 = new StringBuilder();
        char[] var15 = var7.toCharArray();
        int var14 = llIIIllIIIl[1];
        char[] var32 = var8.toCharArray();
        int var18 = var32.length;
        int var24 = llIIIllIIIl[1];
        while (V.lIIllllIllIllI(var24, var18)) {
            char var30 = var32[var24];
            var12.append((char)(var30 ^ var15[var14 % var15.length]));
            0;
            ++var14;
            ++var24;
            0;
            if (1 >= 0) continue;
            return null;
        }
        return String.valueOf(var12);
    }

    public void d(int[] nArray) {
        Iterator var19 = Inventory.getAll((int[])nArray).stream().filter(item -> {
            String[] stringArray = new String[llIIIllIIIl[0]];
            stringArray[V.llIIIllIIIl[1]] = llIIIlIllIl[llIIIllIIIl[9]];
            stringArray[V.llIIIllIIIl[2]] = llIIIlIllIl[llIIIllIIIl[10]];
            stringArray[V.llIIIllIIIl[3]] = llIIIlIllIl[llIIIllIIIl[11]];
            return item.hasAction(stringArray);
        }).collect(Collectors.toList()).iterator();
        while (V.lIIllllIlIlllI(var19.hasNext() ? 1 : 0)) {
            Item var20 = (Item)var19.next();
            String[] stringArray = new String[llIIIllIIIl[0]];
            stringArray[V.llIIIllIIIl[1]] = llIIIlIllIl[llIIIllIIIl[1]];
            stringArray[V.llIIIllIIIl[2]] = llIIIlIllIl[llIIIllIIIl[2]];
            stringArray[V.llIIIllIIIl[3]] = llIIIlIllIl[llIIIllIIIl[3]];
            var20.interact(stringArray);
            0;
            if (-2 <= 0) continue;
            return;
        }
    }

    private static boolean lIIllllIllIIlI(Object object) {
        return object != null;
    }

    public V(TOAConfig tOAConfig, ExecutorService executorService) {
        this.cf = tOAConfig;
        this.cg = executorService;
    }

    static {
        V.lIIllllIlIllIl();
        V.lIIllllIIllllI();
    }

    private static boolean lIIllllIllIlIl(int n2) {
        return n2 == 0;
    }

    private int[] k(String string) {
        return Stream.of(string.split(llIIIlIllIl[llIIIllIIIl[0]])).mapToInt(Integer::parseInt).toArray();
    }

    private static boolean lIIllllIlIlllI(int n2) {
        return n2 != 0;
    }

    /*
     * WARNING - void declaration
     */
    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox, ConfigStorageBox<EquipmentSetup> configStorageBox2, int n2) {
        void var34;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (V.lIIllllIlIllll(equipmentSetup)) {
            return ((EquipmentSetup)configStorageBox2.selected(EquipmentSetup.class)).getIds();
        }
        if (V.lIIllllIllIIII(Vars.getBit((int)llIIIllIIIl[4]), llIIIllIIIl[2])) {
            var34 /= llIIIllIIIl[3];
        }
        if (V.lIIllllIllIIIl(Combat.getSpecEnergy(), (int)var34)) {
            void var33;
            V var1;
            var1.aK();
            return var33.getIds();
        }
        return ((EquipmentSetup)configStorageBox2.selected(EquipmentSetup.class)).getIds();
    }

    private static String lIIllllIIllIll(String var6, String var9) {
        try {
            SecretKeySpec var21 = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(var9.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher var25 = Cipher.getInstance("Blowfish");
            var25.init(llIIIllIIIl[3], var21);
            return new String(var25.doFinal(Base64.getDecoder().decode(var6.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception var27) {
            var27.printStackTrace();
            return null;
        }
    }

    public abstract int[] j(String var1);

    public void l(int n2) {
        int[] nArray = new int[llIIIllIIIl[2]];
        nArray[V.llIIIllIIIl[1]] = n2;
        NPC nPC = NPCs.getNearest((int[])nArray);
        if (V.lIIllllIlIllll(nPC)) {
            return;
        }
        this.ck = nPC.getIndex();
    }

    private static void lIIllllIlIllIl() {
        llIIIllIIIl = new int[15];
        V.llIIIllIIIl[0] = 3;
        V.llIIIllIIIl[1] = (0x74 ^ 0x50 ^ (0x7B ^ 0xA)) & (0xB9 ^ 0x95 ^ (0x32 ^ 0x4B) ^ -1);
        V.llIIIllIIIl[2] = 1;
        V.llIIIllIIIl[3] = 2;
        V.llIIIllIIIl[4] = -(0xD1 ^ 0xB0) & (0xFFFFFCFF & 0x3B79);
        V.llIIIllIIIl[5] = 0xB9 ^ 0xBD;
        V.llIIIllIIIl[6] = 0xC ^ 9;
        V.llIIIllIIIl[7] = 0x34 ^ 0x32;
        V.llIIIllIIIl[8] = 0xD3 ^ 0x91 ^ (0x21 ^ 0x64);
        V.llIIIllIIIl[9] = 0x9E ^ 0x96;
        V.llIIIllIIIl[10] = 0x3E ^ 0x37;
        V.llIIIllIIIl[11] = 3 ^ 0xA ^ 3;
        V.llIIIllIIIl[12] = -1;
        V.llIIIllIIIl[13] = 118 + 7 - 29 + 57 ^ 15 + 89 - 38 + 82;
        V.llIIIllIIIl[14] = 3 ^ 8;
    }

    protected void b(MenuOptionClicked menuOptionClicked) {
    }

    public void a(int[] nArray, MenuEntry menuEntry) {
        this.cg.submit(() -> {
            void var4_4;
            void var5_5;
            int n2;
            V var4;
            void var29;
            Client client = Static.getClient();
            this.d(nArray);
            if (V.lIIllllIlIlllI(this.ch ? 1 : 0)) {
                this.ch = llIIIllIIIl[1];
                if (V.lIIllllIllIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
                    Combat.toggleSpec();
                }
            }
            int var26 = var29.getType().getId();
            if (V.lIIllllIllIIlI(var4.ci)) {
                Magic.selectSpell((Spell)var4.ci);
                var26 = MenuAction.WIDGET_TARGET_ON_NPC.getId();
                var4.ci = null;
            }
            if (V.lIIllllIllIlll(var4.ck, llIIIllIIIl[12])) {
                n2 = var4.ck;
                0;
                if (2 != 2) {
                    return;
                }
            } else {
                int var2;
                n2 = var2 = var29.getIdentifier();
            }
            if ((!V.lIIllllIllIIIl(var26, llIIIllIIIl[10]) || V.lIIllllIlllIII(var26, llIIIllIIIl[13])) && V.lIIllllIllIlll(var26, MenuAction.WIDGET_TARGET_ON_NPC.getId())) {
                var26 = MenuAction.NPC_SECOND_OPTION.getId();
            }
            client.interact((int)var5_5, (int)var4_4, menuEntry.getParam0(), menuEntry.getParam1());
            this.ck = llIIIllIIIl[12];
        });
        0;
    }

    public void aK() {
        this.ch = llIIIllIIIl[2];
    }

    private static boolean lIIllllIlIllll(Object object) {
        return object == null;
    }

    private static boolean lIIllllIllIIll(int n2, int n3) {
        return n2 <= n3;
    }

    public void a(Spell spell) {
        this.ci = spell;
    }
}

