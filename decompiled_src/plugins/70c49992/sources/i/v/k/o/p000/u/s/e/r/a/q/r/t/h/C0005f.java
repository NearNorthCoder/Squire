package i.v.k.o.p000.u.s.e.r.a.q.r.t.h;

import com.openosrs.client.util.WeaponMap;
import com.openosrs.client.util.WeaponStyle;
import gg.squire.vorkath.SquireVorkathConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.Item;
import net.runelite.api.NPC;
import net.runelite.api.Projectile;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.ProjectileSpawned;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Projectiles;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
@Singleton
/* renamed from: i.v.k.o.-.u.s.e.r.a.q.r.t.h.f  reason: invalid package and case insensitive filesystem */
/* loaded from: 70c49992-0f4a-4f1f-b83d-1bdcbc531725.jar:i/v/k/o/-/u/s/e/r/a/q/r/t/h/f.class */
public class C0005f {
    private static final /* synthetic */ int K;
    private static /* synthetic */ int[] lIlIlIlIlIIIl;
    private static final /* synthetic */ int N;
    private static final /* synthetic */ String J;
    private static final /* synthetic */ int L;
    private static /* synthetic */ String[] lIlIlIlIIllll;
    private static final /* synthetic */ int M;
    @Inject
    private /* synthetic */ SquireVorkathConfig y;
    public /* synthetic */ int O = lIlIlIlIlIIIl[0];
    public /* synthetic */ int P = lIlIlIlIlIIIl[0];
    public /* synthetic */ int Q = lIlIlIlIlIIIl[0];
    private /* synthetic */ boolean R = lIlIlIlIlIIIl[1];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v24, types: [boolean] */
    public boolean d(WorldPoint worldPoint, WorldPoint worldPoint2) {
        int llllllllllllllIllIlIlIllllllIlll = Math.abs(worldPoint.getY() - worldPoint2.getWorldY());
        WorldPoint dy = worldPoint.dy(lIlIlIlIlIIIl[3]);
        int i2 = lIlIlIlIlIIIl[10];
        if (lIlllllIlllIlIl(Equipment.contains(item -> {
            return item.getName().toLowerCase().contains(lIlIlIlIIllll[lIlIlIlIlIIIl[12]]);
        }) ? 1 : 0)) {
            i2 = lIlIlIlIlIIIl[11];
        }
        if (lIlllllIlllIlIl(C() ? 1 : 0)) {
            i2 = lIlIlIlIlIIIl[9];
        }
        if (lIlllllIllllIIl(llllllllllllllIllIlIlIllllllIlll, i2) && lIlllllIlllIlIl(TileObjects.getAll(tileObject -> {
            if (lIlllllIlllIIll(tileObject.getId(), lIlIlIlIlIIIl[5]) && lIlllllIlllIlIl(tileObject.getWorldLocation().equals(dy) ? 1 : 0)) {
                ?? r0 = lIlIlIlIlIIIl[3];
                "".length();
                return (((55 ^ 35) ^ (197 ^ 192)) & (((108 ^ 35) ^ (40 ^ 118)) ^ (-" ".length()))) >= "   ".length() ? " ".length() & (" ".length() ^ (-" ".length())) : r0;
            }
            return lIlIlIlIlIIIl[1];
        }).isEmpty() ? 1 : 0)) {
            ?? r0 = lIlIlIlIlIIIl[3];
            "".length();
            return "   ".length() <= "  ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return lIlIlIlIlIIIl[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    public boolean z() {
        int[] iArr = new int[lIlIlIlIlIIIl[3]];
        iArr[lIlIlIlIlIIIl[1]] = lIlIlIlIlIIIl[6];
        Projectile nearest = Projectiles.getNearest(iArr);
        if (lIlllllIlllIIIl(nearest) && lIlllllIlllIIlI(nearest.getRemainingCycles(), lIlIlIlIlIIIl[7])) {
            ?? r0 = lIlIlIlIlIIIl[3];
            "".length();
            return (((217 ^ 140) ^ (18 ^ 38)) & (((((110 + 85) - 97) + 122) ^ (((58 + 14) - 11) + 128)) ^ (-" ".length()))) >= " ".length() ? ((((154 + 189) - 162) + 25) ^ (((114 + 0) - (-15)) + 30)) & (((29 ^ 115) ^ (4 ^ 59)) ^ (-" ".length())) : r0;
        }
        return lIlIlIlIlIIIl[1];
    }

    public EnumC0009j B() {
        return lIlllllIlllIlIl(this.R ? 1 : 0) ? EnumC0009j.FREEZE : lIlllllIlllIlIl(y() ? 1 : 0) ? EnumC0009j.FIRE_BALLS : EnumC0009j.NONE;
    }

    public int F() {
        return this.O;
    }

    public int H() {
        return this.Q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    public void a() {
        this.O = lIlIlIlIlIIIl[0];
        this.R = lIlIlIlIlIIIl[1];
    }

    private static int lIlllllIlllIlll(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static String lIlllllIllIlIII(String llllllllllllllIllIlIlIlllIllllII, String llllllllllllllIllIlIlIlllIlllIll) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIlllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlllIlllIll.getBytes(StandardCharsets.UTF_8)), lIlIlIlIlIIIl[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIlIlIlIlIIIl[9], llllllllllllllIllIlIlIlllIllllll);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIlllIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIlllIllllIl) {
            llllllllllllllIllIlIlIlllIllllIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIlllllIlllIlIl(int i2) {
        return i2 != 0;
    }

    public NPC A() {
        String[] strArr = new String[lIlIlIlIlIIIl[3]];
        strArr[lIlIlIlIlIIIl[1]] = lIlIlIlIIllll[lIlIlIlIlIIIl[9]];
        return NPCs.getNearest(strArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public boolean y() {
        NPC c = c(lIlIlIlIlIIIl[3]);
        if (lIlllllIllIllll(c)) {
            return lIlIlIlIlIIIl[1];
        }
        if (lIlllllIlllIIII(c.getAnimation(), lIlIlIlIlIIIl[4])) {
            int[] iArr = new int[lIlIlIlIlIIIl[3]];
            iArr[lIlIlIlIlIIIl[1]] = lIlIlIlIlIIIl[5];
            if (lIlllllIllIllll(TileObjects.getNearest(iArr))) {
                int[] iArr2 = new int[lIlIlIlIlIIIl[3]];
                iArr2[lIlIlIlIlIIIl[1]] = lIlIlIlIlIIIl[6];
                if (!lIlllllIlllIIIl(Projectiles.getNearest(iArr2))) {
                    return lIlIlIlIlIIIl[1];
                }
            }
        }
        ?? r0 = lIlIlIlIlIIIl[3];
        "".length();
        return " ".length() <= 0 ? ((253 ^ 129) ^ (89 ^ 41)) & (((((59 + 99) - 42) + 34) ^ (((27 + 73) - 65) + 119)) ^ (-" ".length())) : r0;
    }

    static {
        lIlllllIllIllIl();
        lIlllllIllIlIll();
        K = lIlIlIlIlIIIl[4];
        M = lIlIlIlIlIIIl[8];
        J = lIlIlIlIIllll[lIlIlIlIlIIIl[16]];
        L = lIlIlIlIlIIIl[5];
        N = lIlIlIlIlIIIl[17];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (lIlllllIlllIllI(animationChanged.getActor(), c(lIlIlIlIlIIIl[3])) && lIlllllIlllIIII(animationChanged.getActor().getAnimation(), lIlIlIlIlIIIl[0])) {
            this.Q = Static.getClient().getTickCount();
        }
    }

    private static boolean lIlllllIllllIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static String lIlllllIllIIllI(String llllllllllllllIllIlIlIlllllIIIIl, String llllllllllllllIllIlIlIlllllIIIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIlllllIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIlllllIIIll = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIlllllIIIll.init(lIlIlIlIlIIIl[9], secretKeySpec);
            return new String(llllllllllllllIllIlIlIlllllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIlllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllIllIlIlIlllllIIIlI) {
            llllllllllllllIllIlIlIlllllIIIlI.printStackTrace();
            return null;
        }
    }

    private static String lIlllllIllIIlll(String llllllllllllllIllIlIlIllllIlIIIl, String llllllllllllllIllIlIlIllllIlIIII) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllIllIlIlIllllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIllIlIlIllllIIllll = new StringBuilder();
        char[] charArray = llllllllllllllIllIlIlIllllIlIIII.toCharArray();
        int llllllllllllllIllIlIlIllllIIllIl = lIlIlIlIlIIIl[1];
        char[] charArray2 = str.toCharArray();
        int llllllllllllllIllIlIlIllllIIIllI = charArray2.length;
        int i2 = lIlIlIlIlIIIl[1];
        while (lIlllllIllllIlI(i2, llllllllllllllIllIlIlIllllIIIllI)) {
            llllllllllllllIllIlIlIllllIIllll.append((char) (charArray2[i2] ^ charArray[llllllllllllllIllIlIlIllllIIllIl % charArray.length]));
            "".length();
            llllllllllllllIllIlIlIllllIIllIl++;
            i2++;
            "".length();
            if ((("  ".length() ^ (49 ^ 43)) & (((246 ^ 178) ^ (227 ^ 191)) ^ (-" ".length()))) >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIllIlIlIllllIIllll);
    }

    private static void lIlllllIllIlIll() {
        lIlIlIlIIllll = new String[lIlIlIlIlIIIl[18]];
        lIlIlIlIIllll[lIlIlIlIlIIIl[1]] = lIlllllIllIIllI("0/qEBX1Ahqs4FmKoJw7fkJJyeLcK0DKf", "XZscT");
        lIlIlIlIIllll[lIlIlIlIlIIIl[3]] = lIlllllIllIIlll("Mw0/AA8jGTAcDWYaNgdKJxB5Gx5mBzYXGWYQNg==", "FcYrj");
        lIlIlIlIIllll[lIlIlIlIlIIIl[9]] = lIlllllIllIlIII("OhE2t0kdWQq4acFgrsTQKQ==", "LrpWc");
        lIlIlIlIIllll[lIlIlIlIlIIIl[12]] = lIlllllIllIlIII("1EU+tTMa9CkSH2quNTL76Q==", "xrilH");
        lIlIlIlIIllll[lIlIlIlIlIIIl[13]] = lIlllllIllIlIII("oao8LVv0nWI=", "VbWVA");
        lIlIlIlIIllll[lIlIlIlIlIIIl[7]] = lIlllllIllIIllI("WqiaXgw5kgU=", "CkhMC");
        lIlIlIlIIllll[lIlIlIlIlIIIl[11]] = lIlllllIllIIlll("ax9m", "CzOjX");
        lIlIlIlIIllll[lIlIlIlIlIIIl[14]] = lIlllllIllIlIII("8tEefnz1ahw=", "uZIMo");
        lIlIlIlIIllll[lIlIlIlIlIIIl[10]] = lIlllllIllIIlll("MiENFTIY", "sUytQ");
        lIlIlIlIIllll[lIlIlIlIlIIIl[15]] = lIlllllIllIIllI("flR15gz3LV0=", "wlXec");
        lIlIlIlIIllll[lIlIlIlIlIIIl[16]] = lIlllllIllIlIII("QKJ2UvGPvzfkdSricMhv6g==", "KIzCD");
    }

    public int x() {
        return Vars.getBit(lIlIlIlIlIIIl[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void b(ChatMessage chatMessage) {
        if (!lIlllllIlllIlII(chatMessage.getMessage().contains(lIlIlIlIIllll[lIlIlIlIlIIIl[1]]) ? 1 : 0) || lIlllllIlllIlIl(chatMessage.getMessage().contains(lIlIlIlIIllll[lIlIlIlIlIIIl[3]]) ? 1 : 0)) {
            this.R = lIlIlIlIlIIIl[1];
        }
    }

    public boolean I() {
        return this.R;
    }

    private static boolean lIlllllIlllIIIl(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    @Subscribe
    public void a(GameTick gameTick) {
        NPC A = A();
        if (lIlllllIlllIIIl(A) && lIlllllIlllIlIl(A.isDead() ? 1 : 0)) {
            this.R = lIlIlIlIlIIIl[1];
        }
        if (lIlllllIllIllll(c(lIlIlIlIlIIIl[3]))) {
            this.R = lIlIlIlIlIIIl[1];
        }
    }

    public int G() {
        return this.P;
    }

    private static boolean lIlllllIllIllll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    public EquipmentSetup D() {
        int i2;
        NPC c = c(lIlIlIlIlIIIl[3]);
        EquipmentSetup equipmentSetup = ((BankLoadout) this.y.bankLoadout().selected(BankLoadout.class)).getEquipmentSetup();
        if (lIlllllIllIllll(c)) {
            return equipmentSetup;
        }
        double healthRatio = (c.getHealthRatio() / c.getHealthScale()) * 100.0d;
        if (lIlllllIlllIlII(equipmentSetup.contains(itemComposition -> {
            if (lIlllllIlllIIIl(itemComposition.getName()) && lIlllllIlllIlIl(itemComposition.getName().contains(lIlIlIlIIllll[lIlIlIlIlIIIl[11]]) ? 1 : 0)) {
                ?? r0 = lIlIlIlIlIIIl[3];
                "".length();
                return "  ".length() == 0 ? ((120 ^ 47) ^ (98 ^ 2)) & (((150 ^ 132) ^ (60 ^ 25)) ^ (-" ".length())) : r0;
            }
            return lIlIlIlIlIIIl[1];
        }) ? 1 : 0)) {
            return equipmentSetup;
        }
        Item first = Inventory.getFirst(item -> {
            if (lIlllllIlllIlIl(item.getName().contains(lIlIlIlIIllll[lIlIlIlIlIIIl[13]]) ? 1 : 0) && lIlllllIlllIlIl(item.getName().toLowerCase().contains(lIlIlIlIIllll[lIlIlIlIlIIIl[7]]) ? 1 : 0)) {
                ?? r0 = lIlIlIlIlIIIl[3];
                "".length();
                return "   ".length() == 0 ? "   ".length() & ("   ".length() ^ (-" ".length())) : r0;
            }
            return lIlIlIlIlIIIl[1];
        });
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.AMMO);
        if (lIlllllIllIllll(first)) {
            first = fromSlot;
        }
        if (lIlllllIllllIII(lIlllllIlllIlll(healthRatio, 35.0d))) {
            EquipmentInventorySlot equipmentInventorySlot = EquipmentInventorySlot.AMMO;
            if (lIlllllIlllIIIl(first)) {
                i2 = first.getId();
                "".length();
                if ((-" ".length()) > ((14 ^ 75) & ((11 ^ 78) ^ (-1)))) {
                    return null;
                }
            } else {
                i2 = lIlIlIlIlIIIl[0];
            }
            return equipmentSetup.derive(equipmentInventorySlot, i2);
        }
        return equipmentSetup;
    }

    private static boolean lIlllllIlllIllI(Object obj, Object obj2) {
        return obj == obj2;
    }

    public void a(int i2) {
        this.O = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    public boolean C() {
        Item fromSlot = Equipment.fromSlot(EquipmentInventorySlot.WEAPON);
        if (lIlllllIllIllll(fromSlot)) {
            return lIlIlIlIlIIIl[3];
        }
        if (lIlllllIlllIllI(WeaponMap.StyleMap.getOrDefault(Integer.valueOf(fromSlot.getId()), WeaponStyle.MELEE), WeaponStyle.MELEE)) {
            ?? r0 = lIlIlIlIlIIIl[3];
            "".length();
            return 0 != 0 ? ((50 ^ 1) ^ (251 ^ 199)) & (((((80 + 124) - 90) + 16) ^ (((55 + 88) - 37) + 35)) ^ (-" ".length())) : r0;
        }
        return lIlIlIlIlIIIl[1];
    }

    private static boolean lIlllllIllllIII(int i2) {
        return i2 <= 0;
    }

    public NPC c(boolean z) {
        return NPCs.getNearest(npc -> {
            String str;
            if (lIlllllIlllIlIl(npc.getName().equals(lIlIlIlIIllll[lIlIlIlIlIIIl[14]]) ? 1 : 0)) {
                String[] strArr = new String[lIlIlIlIlIIIl[3]];
                int i2 = lIlIlIlIlIIIl[1];
                if (lIlllllIlllIlIl(z ? 1 : 0)) {
                    str = lIlIlIlIIllll[lIlIlIlIlIIIl[10]];
                    "".length();
                    if (0 != 0) {
                        return (true ^ true) & ((true ^ true) ^ true);
                    }
                } else {
                    str = lIlIlIlIIllll[lIlIlIlIlIIIl[15]];
                }
                strArr[i2] = str;
                if (lIlllllIlllIlIl(npc.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIlIlIlIlIIIl[3];
                    "".length();
                    return "  ".length() == 0 ? ((163 ^ 187) ^ (141 ^ 158)) & (((159 ^ 137) ^ (41 ^ 52)) ^ (-" ".length())) : r0;
                }
            }
            return lIlIlIlIlIIIl[1];
        });
    }

    private static boolean lIlllllIlllIIII(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIlllllIllllIIl(int i2, int i3) {
        return i2 >= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ProjectileSpawned projectileSpawned) {
        if (lIlllllIlllIIll(projectileSpawned.getProjectile().getId(), lIlIlIlIlIIIl[8])) {
            this.R = lIlIlIlIlIIIl[3];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean E() {
        if (lIlllllIllllIlI(Skills.getBoostedLevel(Skill.HITPOINTS), Skills.getLevel(Skill.HITPOINTS))) {
            ?? r0 = lIlIlIlIlIIIl[3];
            "".length();
            return (-" ".length()) >= "  ".length() ? ((59 ^ 26) ^ (154 ^ 129)) & (((22 ^ 54) ^ (184 ^ 162)) ^ (-" ".length())) : r0;
        }
        return lIlIlIlIlIIIl[1];
    }

    private static void lIlllllIllIllIl() {
        lIlIlIlIlIIIl = new int[19];
        lIlIlIlIlIIIl[0] = -" ".length();
        lIlIlIlIlIIIl[1] = (43 ^ 102) & ((253 ^ 176) ^ (-1)) & (((62 ^ 49) & ((204 ^ 195) ^ (-1))) ^ (-1));
        lIlIlIlIlIIIl[2] = (-((-4243) & 6331)) & (-1) & 8187;
        lIlIlIlIlIIIl[3] = " ".length();
        lIlIlIlIlIIIl[4] = (-16555) & 24511;
        lIlIlIlIlIIIl[5] = (-713) & 32712;
        lIlIlIlIlIIIl[6] = (-((-18689) & 31493)) & (-18481) & 32767;
        lIlIlIlIlIIIl[7] = (((80 + 98) - 141) + 113) ^ (((9 + 57) - 53) + 134);
        lIlIlIlIlIIIl[8] = (-((-9549) & 32591)) & (-50) & 24575;
        lIlIlIlIlIIIl[9] = "  ".length();
        lIlIlIlIlIIIl[10] = 87 ^ 95;
        lIlIlIlIlIIIl[11] = (121 ^ 86) ^ (105 ^ 64);
        lIlIlIlIlIIIl[12] = "   ".length();
        lIlIlIlIlIIIl[13] = (94 ^ 120) ^ (1 ^ 35);
        lIlIlIlIlIIIl[14] = 92 ^ 91;
        lIlIlIlIlIIIl[15] = (((77 + 65) - 60) + 59) ^ (((26 + 109) - 43) + 40);
        lIlIlIlIlIIIl[16] = (((10 + 134) - (-32)) + 31) ^ (((187 + 140) - 314) + 184);
        lIlIlIlIlIIIl[17] = (-2619) & 4095;
        lIlIlIlIlIIIl[18] = 184 ^ 179;
    }

    public void b(int i2) {
        this.P = i2;
    }

    private static boolean lIlllllIlllIIlI(int i2, int i3) {
        return i2 > i3;
    }

    private static boolean lIlllllIlllIIll(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean lIlllllIlllIlII(int i2) {
        return i2 == 0;
    }
}
