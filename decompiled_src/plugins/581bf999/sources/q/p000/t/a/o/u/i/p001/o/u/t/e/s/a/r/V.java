package q.p000.t.a.o.u.i.p001.o.u.t.e.s.a.r;

import gg.squire.autotoa.TOAConfig;
import gg.squire.client.plugins.fw.Task;
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
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.Spell;
import net.unethicalite.api.magic.SpellBook;
import net.unethicalite.client.Static;
/* renamed from: q.-.t.a.o.u.i.-.o.u.t.e.s.a.r.V  reason: invalid package */
/* loaded from: 581bf999-de0d-4fc5-a3b6-1ebe3d93b748.jar:q/-/t/a/o/u/i/-/o/u/t/e/s/a/r/V.class */
public abstract class V extends Task {
    private final /* synthetic */ ExecutorService cg;
    private /* synthetic */ boolean ch;
    private /* synthetic */ int ck;
    private /* synthetic */ int cj;
    private /* synthetic */ Spell ci;
    private static /* synthetic */ String[] llIIIlIllIl;
    private static /* synthetic */ int[] llIIIllIIIl;
    protected final /* synthetic */ TOAConfig cf;

    private static boolean lIIllllIllIlII(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIIllllIIllllI() {
        llIIIlIllIl = new String[llIIIllIIIl[14]];
        llIIIlIllIl[llIIIllIIIl[1]] = lIIllllIIllIll("qicppQwt7BQ=", "usrdn");
        llIIIlIllIl[llIIIllIIIl[2]] = lIIllllIIlllII("EDQREQ==", "GQpcO");
        llIIIlIllIl[llIIIllIIIl[3]] = lIIllllIIllIll("MR+v0giXR+Q=", "sfgXh");
        llIIIlIllIl[llIIIllIIIl[0]] = lIIllllIIllIll("dRHQnh+6qB8=", "UhXrp");
        llIIIlIllIl[llIIIllIIIl[5]] = lIIllllIIllIll("iZIl9U3MZfw=", "XFMup");
        llIIIlIllIl[llIIIllIIIl[6]] = lIIllllIIllIll("Q/hV8z1Fwko=", "GZLzZ");
        llIIIlIllIl[llIIIllIIIl[7]] = lIIllllIIlllII("FG94eFkUbg==", "HGVRf");
        llIIIlIllIl[llIIIllIIIl[8]] = lIIllllIIlllIl("J344VV8bJ9M=", "MUajB");
        llIIIlIllIl[llIIIllIIIl[9]] = lIIllllIIlllII("JRMDPSc=", "rzfQC");
        llIIIlIllIl[llIIIllIIIl[10]] = lIIllllIIllIll("JPxFzk6f2Gc=", "CdcqD");
        llIIIlIllIl[llIIIllIIIl[11]] = lIIllllIIlllII("NAIaPBQ=", "qsoUd");
    }

    private static String lIIllllIIlllIl(String llllllllllllllllIlIIIIlllIlIIIll, String llllllllllllllllIlIIIIlllIlIIIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIlllIlIIIlI.getBytes(StandardCharsets.UTF_8)), llIIIllIIIl[9]), "DES");
            Cipher llllllllllllllllIlIIIIlllIlIIlIl = Cipher.getInstance("DES");
            llllllllllllllllIlIIIIlllIlIIlIl.init(llIIIllIIIl[3], secretKeySpec);
            return new String(llllllllllllllllIlIIIIlllIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIlllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIlllIlIIlII) {
            llllllllllllllllIlIIIIlllIlIIlII.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    public boolean run() {
        return llIIIllIIIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15, types: [boolean] */
    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        int gameCycle = Static.getClient().getGameCycle();
        if (lIIllllIllIIll(gameCycle - this.cj, llIIIllIIIl[2])) {
            return;
        }
        this.cj = gameCycle;
        if (lIIllllIlIlllI(menuOptionClicked.getMenuOption().contains(llIIIlIllIl[llIIIllIIIl[5]]) ? 1 : 0) && lIIllllIllIlII(SpellBook.getCurrent(), SpellBook.ANCIENT)) {
            b(menuOptionClicked);
        } else if (lIIllllIllIlIl(menuOptionClicked.getMenuOption().contains(llIIIlIllIl[llIIIllIIIl[6]]) ? 1 : 0)) {
        } else {
            Spell[] values = SpellBook.Ancient.values();
            int length = values.length;
            int i = llIIIllIIIl[1];
            while (lIIllllIllIllI(i, length)) {
                if (lIIllllIlIlllI(Magic.isSpellSelected(values[i]) ? 1 : 0)) {
                    return;
                }
                i++;
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            }
            if (lIIllllIlIlllI(Combat.isSpecEnabled() ? 1 : 0)) {
                return;
            }
            int[] j = j(Text.removeTags(menuOptionClicked.getMenuTarget()).replaceAll(llIIIlIllIl[llIIIllIIIl[7]], llIIIlIllIl[llIIIllIIIl[8]]).trim());
            if (lIIllllIllIlIl(j.length)) {
                return;
            }
            menuOptionClicked.setConsumed((boolean) llIIIllIIIl[2]);
            a(j, menuOptionClicked.getMenuEntry());
        }
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox) {
        EquipmentSetup equipmentSetup = (EquipmentSetup) configStorageBox.selected(EquipmentSetup.class);
        if (lIIllllIllIIlI(equipmentSetup)) {
            int[] ids = equipmentSetup.getIds();
            "".length();
            if ((((((72 + 64) - 51) + 60) ^ (((102 + 83) - 157) + 150)) & (((((115 + 39) - 30) + 44) ^ (((39 + 44) - 7) + 63)) ^ (-" ".length()))) != 0) {
                return null;
            }
            return ids;
        }
        return new int[llIIIllIIIl[1]];
    }

    private static boolean lIIllllIllIIIl(int i, int i2) {
        return i >= i2;
    }

    private static boolean lIIllllIllIIII(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIllllIlllIII(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIllllIllIllI(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIllllIllIlll(int i, int i2) {
        return i != i2;
    }

    public abstract boolean aL();

    private static String lIIllllIIlllII(String llllllllllllllllIlIIIIlllIlllIII, String llllllllllllllllIlIIIIlllIllIlll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIIIIlllIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIIIIlllIllIllI = new StringBuilder();
        char[] llllllllllllllllIlIIIIlllIllIlIl = llllllllllllllllIlIIIIlllIllIlll.toCharArray();
        int llllllllllllllllIlIIIIlllIllIlII = llIIIllIIIl[1];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = llIIIllIIIl[1];
        while (lIIllllIllIllI(i, length)) {
            char llllllllllllllllIlIIIIlllIlllIIl = charArray[i];
            llllllllllllllllIlIIIIlllIllIllI.append((char) (llllllllllllllllIlIIIIlllIlllIIl ^ llllllllllllllllIlIIIIlllIllIlIl[llllllllllllllllIlIIIIlllIllIlII % llllllllllllllllIlIIIIlllIllIlIl.length]));
            "".length();
            llllllllllllllllIlIIIIlllIllIlII++;
            i++;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIIIIlllIllIllI);
    }

    public void d(int[] iArr) {
        for (Item item : (List) Inventory.getAll(iArr).stream().filter(item2 -> {
            String[] strArr = new String[llIIIllIIIl[0]];
            strArr[llIIIllIIIl[1]] = llIIIlIllIl[llIIIllIIIl[9]];
            strArr[llIIIllIIIl[2]] = llIIIlIllIl[llIIIllIIIl[10]];
            strArr[llIIIllIIIl[3]] = llIIIlIllIl[llIIIllIIIl[11]];
            return item2.hasAction(strArr);
        }).collect(Collectors.toList())) {
            String[] strArr = new String[llIIIllIIIl[0]];
            strArr[llIIIllIIIl[1]] = llIIIlIllIl[llIIIllIIIl[1]];
            strArr[llIIIllIIIl[2]] = llIIIlIllIl[llIIIllIIIl[2]];
            strArr[llIIIllIIIl[3]] = llIIIlIllIl[llIIIllIIIl[3]];
            item.interact(strArr);
            "".length();
            if ((-"  ".length()) > 0) {
                return;
            }
        }
    }

    private static boolean lIIllllIllIIlI(Object obj) {
        return obj != null;
    }

    public V(TOAConfig tOAConfig, ExecutorService executorService) {
        this.cf = tOAConfig;
        this.cg = executorService;
    }

    static {
        lIIllllIlIllIl();
        lIIllllIIllllI();
    }

    private static boolean lIIllllIllIlIl(int i) {
        return i == 0;
    }

    private int[] k(String str) {
        return Stream.of((Object[]) str.split(llIIIlIllIl[llIIIllIIIl[0]])).mapToInt(Integer::parseInt).toArray();
    }

    private static boolean lIIllllIlIlllI(int i) {
        return i != 0;
    }

    public int[] a(ConfigStorageBox<EquipmentSetup> configStorageBox, ConfigStorageBox<EquipmentSetup> configStorageBox2, int i) {
        EquipmentSetup equipmentSetup = (EquipmentSetup) configStorageBox.selected(EquipmentSetup.class);
        if (lIIllllIlIllll(equipmentSetup)) {
            return ((EquipmentSetup) configStorageBox2.selected(EquipmentSetup.class)).getIds();
        }
        if (lIIllllIllIIII(Vars.getBit(llIIIllIIIl[4]), llIIIllIIIl[2])) {
            i /= llIIIllIIIl[3];
        }
        if (lIIllllIllIIIl(Combat.getSpecEnergy(), i)) {
            aK();
            return equipmentSetup.getIds();
        }
        return ((EquipmentSetup) configStorageBox2.selected(EquipmentSetup.class)).getIds();
    }

    private static String lIIllllIIllIll(String llllllllllllllllIlIIIIlllIIlIllI, String llllllllllllllllIlIIIIlllIIlIlIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIIIIlllIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(llIIIllIIIl[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIIIIlllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIIIIlllIIlIlll) {
            llllllllllllllllIlIIIIlllIIlIlll.printStackTrace();
            return null;
        }
    }

    public abstract int[] j(String str);

    public void l(int i) {
        int[] iArr = new int[llIIIllIIIl[2]];
        iArr[llIIIllIIIl[1]] = i;
        NPC nearest = NPCs.getNearest(iArr);
        if (lIIllllIlIllll(nearest)) {
            return;
        }
        this.ck = nearest.getIndex();
    }

    private static void lIIllllIlIllIl() {
        llIIIllIIIl = new int[15];
        llIIIllIIIl[0] = "   ".length();
        llIIIllIIIl[1] = ((116 ^ 80) ^ (123 ^ 10)) & (((185 ^ 149) ^ (50 ^ 75)) ^ (-" ".length()));
        llIIIllIIIl[2] = " ".length();
        llIIIllIIIl[3] = "  ".length();
        llIIIllIIIl[4] = (-(209 ^ 176)) & (-769) & 15225;
        llIIIllIIIl[5] = 185 ^ 189;
        llIIIllIIIl[6] = 12 ^ 9;
        llIIIllIIIl[7] = 52 ^ 50;
        llIIIllIIIl[8] = (211 ^ 145) ^ (33 ^ 100);
        llIIIllIIIl[9] = 158 ^ 150;
        llIIIllIIIl[10] = 62 ^ 55;
        llIIIllIIIl[11] = (3 ^ 10) ^ "   ".length();
        llIIIllIIIl[12] = -" ".length();
        llIIIllIIIl[13] = (((118 + 7) - 29) + 57) ^ (((15 + 89) - 38) + 82);
        llIIIllIIIl[14] = 3 ^ 8;
    }

    protected void b(MenuOptionClicked menuOptionClicked) {
    }

    public void a(int[] iArr, MenuEntry menuEntry) {
        this.cg.submit(() -> {
            int identifier;
            Client client = Static.getClient();
            d(iArr);
            if (lIIllllIlIlllI(this.ch ? 1 : 0)) {
                this.ch = llIIIllIIIl[1];
                if (lIIllllIllIlIl(Combat.isSpecEnabled() ? 1 : 0)) {
                    Combat.toggleSpec();
                }
            }
            int id = menuEntry.getType().getId();
            if (lIIllllIllIIlI(this.ci)) {
                Magic.selectSpell(this.ci);
                id = MenuAction.WIDGET_TARGET_ON_NPC.getId();
                this.ci = null;
            }
            if (lIIllllIllIlll(this.ck, llIIIllIIIl[12])) {
                identifier = this.ck;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            } else {
                identifier = menuEntry.getIdentifier();
            }
            int llllllllllllllllIlIIIIllllIIIIll = identifier;
            if ((!lIIllllIllIIIl(id, llIIIllIIIl[10]) || lIIllllIlllIII(id, llIIIllIIIl[13])) && lIIllllIllIlll(id, MenuAction.WIDGET_TARGET_ON_NPC.getId())) {
                id = MenuAction.NPC_SECOND_OPTION.getId();
            }
            client.interact(llllllllllllllllIlIIIIllllIIIIll, id, menuEntry.getParam0(), menuEntry.getParam1());
            this.ck = llIIIllIIIl[12];
        });
        "".length();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public void aK() {
        this.ch = llIIIllIIIl[2];
    }

    private static boolean lIIllllIlIllll(Object obj) {
        return obj == null;
    }

    private static boolean lIIllllIllIIll(int i, int i2) {
        return i <= i2;
    }

    public void a(Spell spell) {
        this.ci = spell;
    }
}
