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
package gg.squire.toa.tasks;

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

public abstract class ToaTaskBase
extends Task {
    private  int aP;
    private  Spell aO;
    protected final  TOAConfig aL;
    private  int aQ;
    private  boolean aN;
    private final  ExecutorService aM;

    private static void lIllIlIlllIlIll() {
        lIlIIIIIIlIIl = new String[lIlIIIIIIlIlI[14]];
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[0]] = "Wield";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[2]] = "Wear";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[3]] = "Equip";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[1]] = ",";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[5]] = "Cast";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[6]] = "Attack";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[7]] = "\\(.*?\\)";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[8]] = y.lIllIlIlllIlIIl("", "SuQkq");
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[9]] = "Wield";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[10]] = "Wear";
        y.lIlIIIIIIlIIl[y.lIlIIIIIIlIlI[11]] = "Equip";
    }

        return String.valueOf(var1);
    }

    public void a(Spell spell) {
        this.aO = spell;
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
        void var2;
        EquipmentSetup equipmentSetup = (EquipmentSetup)configStorageBox.selected(EquipmentSetup.class);
        if (y.lIllIlIlllIllIl(equipmentSetup)) {
            return ((EquipmentSetup)configStorageBox2.selected(EquipmentSetup.class)).getIds();
        }
        if (y.lIllIlIllllIIII(Vars.getBit((int)lIlIIIIIIlIlI[4]), lIlIIIIIIlIlI[2])) {
            var2 /= lIlIIIIIIlIlI[3];
        }
        if (y.lIllIlIllllIIIl(Combat.getSpecEnergy(), (int)var2)) {
            void var3;
            y var4;
            var4.B();
            return var3.getIds();
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
        y var5;
        void var6;
        void var7;
        int n2 = Static.getClient().getGameCycle();
        if (y.lIllIlIllllIIll(n2 - this.aP, lIlIIIIIIlIlI[2])) {
            return;
        }
        var5.aP = var7;
        if (y.lIllIlIlllIlllI(var6.getMenuOption().contains(lIlIIIIIIlIIl[lIlIIIIIIlIlI[5]]) ? 1 : 0) && y.lIllIlIllllIlII(SpellBook.getCurrent(), SpellBook.ANCIENT)) {
            var5.b((MenuOptionClicked)var6);
            return;
        }
        if (y.lIllIlIllllIlIl(var6.getMenuOption().contains(lIlIIIIIIlIIl[lIlIIIIIIlIlI[6]]) ? 1 : 0)) {
            return;
        }
        Object var8 = SpellBook.Ancient.values();
        int llllllllllllllIlllIIllIllIIlIlll22 = ((SpellBook.Ancient[])var8).length;
        int var9 = lIlIIIIIIlIlI[0];
        while (y.lIllIlIllllIllI(var9, llllllllllllllIlllIIllIllIIlIlll22)) {
            SpellBook.Ancient var10 = var8[var9];
            if (y.lIllIlIlllIlllI(Magic.isSpellSelected((Spell)var10) ? 1 : 0)) {
                return;
            }
            ++var9;

            if ((0x51 ^ 4 ^ (0xD9 ^ 0x88)) > 0) continue;
            return;
        }
        if (y.lIllIlIlllIlllI(Combat.isSpecEnabled() ? 1 : 0)) {
            return;
        }
        var8 = Text.removeTags((String)var6.getMenuTarget()).replaceAll(lIlIIIIIIlIIl[lIlIIIIIIlIlI[7]], lIlIIIIIIlIIl[lIlIIIIIIlIlI[8]]).trim();
        int[] llllllllllllllIlllIIllIllIIlIlll22 = var5.a((String)var8);
        if (y.lIllIlIllllIlIl(llllllllllllllIlllIIllIllIIlIlll22.length)) {
            return;
        }
        menuOptionClicked.setConsumed(lIlIIIIIIlIlI[2]);
        this.a((int[])var4_5, menuOptionClicked.getMenuEntry());
    }

    public void b(int[] nArray) {
        Iterator var11 = Inventory.getAll((int[])nArray).stream().filter(item -> {
            String[] stringArray = new String[lIlIIIIIIlIlI[1]];
            stringArray[y.lIlIIIIIIlIlI[0]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[9]];
            stringArray[y.lIlIIIIIIlIlI[2]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[10]];
            stringArray[y.lIlIIIIIIlIlI[3]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[11]];
            return item.hasAction(stringArray);
        }).collect(Collectors.toList()).iterator();
        while (y.lIllIlIlllIlllI(var11.hasNext() ? 1 : 0)) {
            y var12;
            Item var13 = (Item)var11.next();
            String[] stringArray = new String[lIlIIIIIIlIlI[1]];
            stringArray[y.lIlIIIIIIlIlI[0]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[0]];
            stringArray[y.lIlIIIIIIlIlI[2]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[2]];
            stringArray[y.lIlIIIIIIlIlI[3]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[3]];
            var13.interact(stringArray);
            if (y.lIllIlIlllIllll(var12.aL.gearSwapDelay())) {
                try {
                    Thread.sleep(var12.aL.gearSwapDelay());

                }
                catch (InterruptedException var14) {
                    // empty catch block
                }
                
            }

            if (((0x2C ^ 0x29) & ~(0x37 ^ 0x32)) < 1) continue;
            return;
        }
        Gear.swapTo((int[])nArray);

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

            if (((0xDB ^ 0x9D) & ~(0x27 ^ 0x61)) > 0) {
                return null;
            }
        } else {
            nArray = new int[lIlIIIIIIlIlI[0]];
        }
        return nArray;
    }

    public ToaTaskBase(TOAConfig tOAConfig, ExecutorService executorService) {
        this.aL = tOAConfig;
        this.aM = executorService;
    }

    public void a(int[] nArray, MenuEntry menuEntry) {
        this.aM.submit(() -> {
            void var4_4;
            void var5_5;
            int n2;
            y var15;
            void var16;
            Client client = Static.getClient();
            this.b(nArray);
            if (y.lIllIlIlllIlllI(this.aN ? 1 : 0)) {
                this.aN = lIlIIIIIIlIlI[0];
                if (y.lIllIlIllllIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
                    Combat.toggleSpec();
                }
            }
            int var17 = var16.getType().getId();
            if (y.lIllIlIllllIIlI(var15.aO)) {
                Magic.selectSpell((Spell)var15.aO);
                var17 = MenuAction.WIDGET_TARGET_ON_NPC.getId();
                var15.aO = null;
            }
            if (y.lIllIlIllllIlll(var15.aQ, lIlIIIIIIlIlI[12])) {
                n2 = var15.aQ;

            } else {
                int var18;
                n2 = var18 = var16.getIdentifier();
            }
            if ((!y.lIllIlIllllIIIl(var17, lIlIIIIIIlIlI[10]) || y.lIllIlIlllllIII(var17, lIlIIIIIIlIlI[13])) && y.lIllIlIllllIlll(var17, MenuAction.WIDGET_TARGET_ON_NPC.getId())) {
                var17 = MenuAction.NPC_SECOND_OPTION.getId();
            }
            client.interact((int)var5_5, (int)var4_4, menuEntry.getParam0(), menuEntry.getParam1());
            this.aQ = lIlIIIIIIlIlI[12];
        });

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

    private static boolean lIllIlIlllllIII(int n2, int n3) {
        return n2 > n3;
    }
}

