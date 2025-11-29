package p000.r.u.q.e.s.o.t.a.i;

import gg.squire.client.plugins.fw.Task;
import gg.squire.toa.TOAConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
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
/* renamed from: -.r.u.q.e.s.o.t.a.i.y  reason: invalid package */
/* loaded from: squire-toa-1.0.1.jar:-/r/u/q/e/s/o/t/a/i/y.class */
public abstract class y extends Task {
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
        lIlIIIIIIlIIl[lIlIIIIIIlIlI[0]] = lIllIlIlllIlIII("NfjuaJ1aZZ4=", "ChfQt");
        lIlIIIIIIlIIl[lIlIIIIIIlIlI[2]] = lIllIlIlllIlIIl("ICAwFg==", "wEQdr");
        lIlIIIIIIlIIl[lIlIIIIIIlIlI[3]] = lIllIlIlllIlIlI("pTc05Y2P2hU=", "BQXBb");
        lIlIIIIIIlIIl[lIlIIIIIIlIlI[1]] = lIllIlIlllIlIIl("eQ==", "UCLda");
        lIlIIIIIIlIIl[lIlIIIIIIlIlI[5]] = lIllIlIlllIlIII("12WzcLBw1RE=", "FyJYG");
        lIlIIIIIIlIIl[lIlIIIIIIlIlI[6]] = lIllIlIlllIlIII("UIN5QeTX+EA=", "UaMhf");
        lIlIIIIIIlIIl[lIlIIIIIIlIlI[7]] = lIllIlIlllIlIlI("7VF3g4fqlDc=", "oMrFs");
        lIlIIIIIIlIIl[lIlIIIIIIlIlI[8]] = lIllIlIlllIlIIl("", "SuQkq");
        lIlIIIIIIlIIl[lIlIIIIIIlIlI[9]] = lIllIlIlllIlIlI("njGpAerHVzQ=", "BdEgR");
        lIlIIIIIIlIIl[lIlIIIIIIlIlI[10]] = lIllIlIlllIlIIl("MwgUHQ==", "dmuos");
        lIlIIIIIIlIIl[lIlIIIIIIlIlI[11]] = lIllIlIlllIlIlI("hTR8dErZs1A=", "IBFSM");
    }

    private static String lIllIlIlllIlIIl(String llllllllllllllIlllIIllIlIllIIlII, String llllllllllllllIlllIIllIlIllIIIll) {
        String llllllllllllllIlllIIllIlIllIIlII2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIllIlIllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIllIlIllIIIlI = new StringBuilder();
        char[] llllllllllllllIlllIIllIlIllIIIIl = llllllllllllllIlllIIllIlIllIIIll.toCharArray();
        int llllllllllllllIlllIIllIlIllIIIII = lIlIIIIIIlIlI[0];
        char[] charArray = llllllllllllllIlllIIllIlIllIIlII2.toCharArray();
        int length = charArray.length;
        int i = lIlIIIIIIlIlI[0];
        while (lIllIlIllllIllI(i, length)) {
            llllllllllllllIlllIIllIlIllIIIlI.append((char) (charArray[i] ^ llllllllllllllIlllIIllIlIllIIIIl[llllllllllllllIlllIIllIlIllIIIII % llllllllllllllIlllIIllIlIllIIIIl.length]));
            "".length();
            llllllllllllllIlllIIllIlIllIIIII++;
            i++;
            "".length();
            if ("  ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIllIlIllIIIlI);
    }

    public void a(Spell spell) {
        this.aO = spell;
    }

    private static String lIllIlIlllIlIII(String llllllllllllllIlllIIllIlIlllIlII, String llllllllllllllIlllIIllIlIlllIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIlIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIlIIIIIIlIlI[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIlIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIlIlllIlIl) {
            llllllllllllllIlllIIllIlIlllIlIl.printStackTrace();
            return null;
        }
    }

    public abstract boolean C();

    public abstract int[] a(String str);

    private static boolean lIllIlIllllIIlI(Object obj) {
        return obj != null;
    }

    static {
        lIllIlIlllIllII();
        lIllIlIlllIlIll();
    }

    private static boolean lIllIlIllllIIII(int i, int i2) {
        return i == i2;
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox, ConfigStorageBox<EquipmentSetup> configStorageBox2, int i) {
        EquipmentSetup equipmentSetup = (EquipmentSetup) configStorageBox.selected(EquipmentSetup.class);
        if (lIllIlIlllIllIl(equipmentSetup)) {
            return ((EquipmentSetup) configStorageBox2.selected(EquipmentSetup.class)).getIds();
        }
        if (lIllIlIllllIIII(Vars.getBit(lIlIIIIIIlIlI[4]), lIlIIIIIIlIlI[2])) {
            i /= lIlIIIIIIlIlI[3];
        }
        if (lIllIlIllllIIIl(Combat.getSpecEnergy(), i)) {
            B();
            return equipmentSetup.getIds();
        }
        return ((EquipmentSetup) configStorageBox2.selected(EquipmentSetup.class)).getIds();
    }

    public void c(int i) {
        int[] iArr = new int[lIlIIIIIIlIlI[2]];
        iArr[lIlIIIIIIlIlI[0]] = i;
        NPC nearest = NPCs.getNearest(iArr);
        if (lIllIlIlllIllIl(nearest)) {
            return;
        }
        this.aQ = nearest.getIndex();
    }

    private int[] A() {
        EquipmentSetup equipmentSetup = (EquipmentSetup) this.aL.barrage().selected(EquipmentSetup.class);
        return lIllIlIlllIllIl(equipmentSetup) ? new int[lIlIIIIIIlIlI[0]] : equipmentSetup.getIds();
    }

    public void a(MenuEntry menuEntry) {
        int[] A = A();
        Client client = Static.getClient();
        this.aM.submit(() -> {
            b(A);
            client.interact(menuEntry.getIdentifier(), menuEntry.getType().getId(), menuEntry.getParam0(), menuEntry.getParam1());
        });
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean run() {
        return lIlIIIIIIlIlI[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public void B() {
        this.aN = lIlIIIIIIlIlI[2];
    }

    private static boolean lIllIlIllllIIll(int i, int i2) {
        return i <= i2;
    }

    private static boolean lIllIlIllllIlIl(int i) {
        return i == 0;
    }

    private static boolean lIllIlIllllIIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIllIlIllllIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIllIlIllllIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        int gameCycle = Static.getClient().getGameCycle();
        if (lIllIlIllllIIll(gameCycle - this.aP, lIlIIIIIIlIlI[2])) {
            return;
        }
        this.aP = gameCycle;
        if (lIllIlIlllIlllI(menuOptionClicked.getMenuOption().contains(lIlIIIIIIlIIl[lIlIIIIIIlIlI[5]]) ? 1 : 0) && lIllIlIllllIlII(SpellBook.getCurrent(), SpellBook.ANCIENT)) {
            b(menuOptionClicked);
        } else if (lIllIlIllllIlIl(menuOptionClicked.getMenuOption().contains(lIlIIIIIIlIIl[lIlIIIIIIlIlI[6]]) ? 1 : 0)) {
        } else {
            Spell[] values = SpellBook.Ancient.values();
            int length = values.length;
            int i = lIlIIIIIIlIlI[0];
            while (lIllIlIllllIllI(i, length)) {
                if (lIllIlIlllIlllI(Magic.isSpellSelected(values[i]) ? 1 : 0)) {
                    return;
                }
                i++;
                "".length();
                if (((81 ^ 4) ^ (217 ^ 136)) <= 0) {
                    return;
                }
            }
            if (lIllIlIlllIlllI(Combat.isSpecEnabled() ? 1 : 0)) {
                return;
            }
            String llllllllllllllIlllIIllIllIIllIII = Text.removeTags(menuOptionClicked.getMenuTarget()).replaceAll(lIlIIIIIIlIIl[lIlIIIIIIlIlI[7]], lIlIIIIIIlIIl[lIlIIIIIIlIlI[8]]).trim();
            int[] a = a(llllllllllllllIlllIIllIllIIllIII);
            if (lIllIlIllllIlIl(a.length)) {
                return;
            }
            menuOptionClicked.setConsumed((boolean) lIlIIIIIIlIlI[2]);
            a(a, menuOptionClicked.getMenuEntry());
        }
    }

    private static String lIllIlIlllIlIlI(String llllllllllllllIlllIIllIllIIIIIIl, String llllllllllllllIlllIIllIllIIIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIlllIIllIllIIIIIII.getBytes(StandardCharsets.UTF_8)), lIlIIIIIIlIlI[9]), "DES");
            Cipher llllllllllllllIlllIIllIllIIIIIll = Cipher.getInstance("DES");
            llllllllllllllIlllIIllIllIIIIIll.init(lIlIIIIIIlIlI[3], secretKeySpec);
            return new String(llllllllllllllIlllIIllIllIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIlllIIllIllIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIlllIIllIllIIIIIlI) {
            llllllllllllllIlllIIllIllIIIIIlI.printStackTrace();
            return null;
        }
    }

    public void b(int[] iArr) {
        for (Item item : (List) Inventory.getAll(iArr).stream().filter(item2 -> {
            String[] strArr = new String[lIlIIIIIIlIlI[1]];
            strArr[lIlIIIIIIlIlI[0]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[9]];
            strArr[lIlIIIIIIlIlI[2]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[10]];
            strArr[lIlIIIIIIlIlI[3]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[11]];
            return item2.hasAction(strArr);
        }).collect(Collectors.toList())) {
            String[] strArr = new String[lIlIIIIIIlIlI[1]];
            strArr[lIlIIIIIIlIlI[0]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[0]];
            strArr[lIlIIIIIIlIlI[2]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[2]];
            strArr[lIlIIIIIIlIlI[3]] = lIlIIIIIIlIIl[lIlIIIIIIlIlI[3]];
            item.interact(strArr);
            if (lIllIlIlllIllll(this.aL.gearSwapDelay())) {
                try {
                    Thread.sleep(this.aL.gearSwapDelay());
                    "".length();
                    if ((-" ".length()) >= 0) {
                        return;
                    }
                } catch (InterruptedException e) {
                }
            }
            "".length();
            if (((44 ^ 41) & ((55 ^ 50) ^ (-1))) >= " ".length()) {
                return;
            }
        }
        Gear.swapTo(iArr);
        "".length();
    }

    protected void b(MenuOptionClicked menuOptionClicked) {
    }

    private static boolean lIllIlIllllIlll(int i, int i2) {
        return i != i2;
    }

    private static boolean lIllIlIlllIlllI(int i) {
        return i != 0;
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        EquipmentSetup equipmentSetup = (EquipmentSetup) configStorageBox.selected(EquipmentSetup.class);
        if (lIllIlIllllIIlI(equipmentSetup)) {
            int[] ids = equipmentSetup.getIds();
            "".length();
            if (((219 ^ 157) & ((39 ^ 97) ^ (-1))) > 0) {
                return null;
            }
            return ids;
        }
        return new int[lIlIIIIIIlIlI[0]];
    }

    public y(TOAConfig tOAConfig, ExecutorService executorService) {
        this.aL = tOAConfig;
        this.aM = executorService;
    }

    public void a(int[] iArr, MenuEntry menuEntry) {
        this.aM.submit(() -> {
            int identifier;
            Client client = Static.getClient();
            b(iArr);
            if (lIllIlIlllIlllI(this.aN ? 1 : 0)) {
                this.aN = lIlIIIIIIlIlI[0];
                if (lIllIlIllllIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
                    Combat.toggleSpec();
                }
            }
            int id = menuEntry.getType().getId();
            if (lIllIlIllllIIlI(this.aO)) {
                Magic.selectSpell(this.aO);
                id = MenuAction.WIDGET_TARGET_ON_NPC.getId();
                this.aO = null;
            }
            if (lIllIlIllllIlll(this.aQ, lIlIIIIIIlIlI[12])) {
                identifier = this.aQ;
                "".length();
                if ((-"  ".length()) > 0) {
                    return;
                }
            } else {
                identifier = menuEntry.getIdentifier();
            }
            int i = identifier;
            if ((!lIllIlIllllIIIl(id, lIlIIIIIIlIlI[10]) || lIllIlIlllllIII(id, lIlIIIIIIlIlI[13])) && lIllIlIllllIlll(id, MenuAction.WIDGET_TARGET_ON_NPC.getId())) {
                id = MenuAction.NPC_SECOND_OPTION.getId();
            }
            client.interact(i, id, menuEntry.getParam0(), menuEntry.getParam1());
            this.aQ = lIlIIIIIIlIlI[12];
        });
        "".length();
    }

    private static boolean lIllIlIlllIllIl(Object obj) {
        return obj == null;
    }

    private int[] b(String str) {
        return Stream.of((Object[]) str.split(lIlIIIIIIlIIl[lIlIIIIIIlIlI[1]])).mapToInt(Integer::parseInt).toArray();
    }

    private static boolean lIllIlIlllIllll(int i) {
        return i > 0;
    }

    private static void lIllIlIlllIllII() {
        lIlIIIIIIlIlI = new int[15];
        lIlIIIIIIlIlI[0] = (48 ^ 126) & ((214 ^ 152) ^ (-1));
        lIlIIIIIIlIlI[1] = "   ".length();
        lIlIIIIIIlIlI[2] = " ".length();
        lIlIIIIIIlIlI[3] = "  ".length();
        lIlIIIIIIlIlI[4] = (-((-21257) & 22447)) & (-65) & 15615;
        lIlIIIIIIlIlI[5] = 56 ^ 60;
        lIlIIIIIIlIlI[6] = 12 ^ 9;
        lIlIIIIIIlIlI[7] = 98 ^ 100;
        lIlIIIIIIlIlI[8] = (124 ^ 75) ^ (97 ^ 81);
        lIlIIIIIIlIlI[9] = (245 ^ 188) ^ (32 ^ 97);
        lIlIIIIIIlIlI[10] = (((24 + 23) - (-60)) + 39) ^ (((27 + 101) - 119) + 146);
        lIlIIIIIIlIlI[11] = (36 ^ 92) ^ (218 ^ 168);
        lIlIIIIIIlIlI[12] = -" ".length();
        lIlIIIIIIlIlI[13] = (127 ^ 91) ^ (114 ^ 91);
        lIlIIIIIIlIlI[14] = (((97 + 32) - (-56)) + 22) ^ (((9 + 94) - 16) + 109);
    }

    private static boolean lIllIlIlllllIII(int i, int i2) {
        return i > i2;
    }
}
