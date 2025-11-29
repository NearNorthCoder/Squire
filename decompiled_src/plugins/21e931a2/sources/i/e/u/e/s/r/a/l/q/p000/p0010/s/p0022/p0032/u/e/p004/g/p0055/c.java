package i.e.u.e.s.r.a.l.q.p000.p0010.s.p0022.p0032.u.e.p004.g.p0055;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.leagues.miner.MinerConfig;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.coords.WorldArea;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
@TaskDesc(name = "Mine rocks")
/* renamed from: i.e.u.e.s.r.a.l.q.-.0.s.2.2.u.e.-.g.5.c  reason: invalid package */
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:i/e/u/e/s/r/a/l/q/-/0/s/2/2/u/e/-/g/5/c.class */
public class c extends Task {
    private static /* synthetic */ String[] llII;
    private final /* synthetic */ MinerConfig f;
    private static /* synthetic */ int[] llIl;
    /* synthetic */ int g = llIl[0];
    /* synthetic */ int h = llIl[1];

    /* renamed from: i  reason: collision with root package name */
    /* synthetic */ int f0i = llIl[2];
    /* synthetic */ int j = llIl[3];
    /* synthetic */ int k = llIl[4];
    /* synthetic */ int l = llIl[5];
    /* synthetic */ int m = llIl[6];
    /* synthetic */ int n = llIl[7];
    /* synthetic */ int o = llIl[8];
    /* synthetic */ int p = llIl[9];
    /* synthetic */ int q = llIl[10];
    /* synthetic */ int r = llIl[11];
    /* synthetic */ int s = llIl[12];
    /* synthetic */ WorldArea t = new WorldArea(llIl[13], llIl[14], llIl[15], llIl[16], llIl[17]);
    /* synthetic */ WorldArea u = new WorldArea(llIl[18], llIl[19], llIl[20], llIl[21], llIl[17]);

    private int a() {
        return lIIIll(this.f.getRockType(), d.RUNE) ? lIIIIl(this.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) ? this.o : this.g : lIIIll(this.f.getRockType(), d.ADDY) ? lIIIIl(this.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) ? this.p : this.m : lIIIll(this.f.getRockType(), d.COAL) ? lIIIIl(this.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) ? this.q : this.h : lIIIll(this.f.getRockType(), d.MITHRIL) ? lIIIIl(this.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) ? this.r : this.k : lIIIll(this.f.getRockType(), d.IRON) ? lIIIIl(this.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0) ? this.s : this.f0i : lIIIll(this.f.getRockType(), d.SOFTCLAY) ? this.j : lIIIll(this.f.getRockType(), d.GOLD) ? this.l : lIIIll(this.f.getRockType(), d.SILVER) ? this.n : llIl[17];
    }

    private static String lllIl(String lllllllIIIlIIlI, String lllllllIIIlIIIl) {
        String lllllllIIIlIIlI2 = new String(Base64.getDecoder().decode(lllllllIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lllllllIIIlIIIl.toCharArray();
        int lllllllIIIIlllI = llIl[17];
        char[] charArray2 = lllllllIIIlIIlI2.toCharArray();
        int length = charArray2.length;
        int i2 = llIl[17];
        while (lIIllI(i2, length)) {
            char lllllllIIIlIIll = charArray2[i2];
            sb.append((char) (lllllllIIIlIIll ^ charArray[lllllllIIIIlllI % charArray.length]));
            "".length();
            lllllllIIIIlllI++;
            i2++;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean lIIIll(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIlIl(int i2) {
        return i2 == 0;
    }

    private static String llllI(String llllllIllllllIl, String llllllIllllllII) {
        try {
            SecretKeySpec lllllllIIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllIllllllII.getBytes(StandardCharsets.UTF_8)), llIl[25]), "DES");
            Cipher llllllIllllllll = Cipher.getInstance("DES");
            llllllIllllllll.init(llIl[23], lllllllIIIIIIII);
            return new String(llllllIllllllll.doFinal(Base64.getDecoder().decode(llllllIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIlllllllI) {
            llllllIlllllllI.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
    public boolean run() {
        if (lIIIIl(Inventory.isFull() ? 1 : 0) && lIIIIl(this.f.getuseBankerNote() ? 1 : 0)) {
            int[] iArr = new int[llIl[22]];
            iArr[llIl[17]] = a.a;
            Item first = Inventory.getFirst(iArr);
            if (lIIIlI(first)) {
                Item first2 = Inventory.getFirst(item -> {
                    if (!(lIIlIl(item.getName().contains(llII[llIl[17]]) ? 1 : 0) && lIIlIl(item.getName().contains(llII[llIl[22]]) ? 1 : 0) && !lIIIIl(item.getName().contains(llII[llIl[23]]) ? 1 : 0)) && lIIlIl(item.isNoted() ? 1 : 0)) {
                        ?? r0 = llIl[22];
                        "".length();
                        return ((80 ^ 28) & ((194 ^ 142) ^ (-1))) > 0 ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIl[17];
                });
                if (lIIIlI(first2)) {
                    first2.useOn(first);
                    return llIl[17];
                }
            }
        }
        if (lIIIIl(Players.getLocal().isIdle() ? 1 : 0)) {
            if (lIIIIl(this.u.contains(Players.getLocal().getWorldLocation()) ? 1 : 0)) {
                int a = a();
                TileObject nearest = TileObjects.getNearest(tileObject -> {
                    if (lIIlII(tileObject.getId(), a) && lIIIIl(this.t.contains(tileObject.getWorldLocation()) ? 1 : 0)) {
                        ?? r0 = llIl[22];
                        "".length();
                        return (-" ".length()) >= "   ".length() ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIl[17];
                });
                if (lIIIlI(nearest)) {
                    nearest.interact(llIl[17]);
                    return llIl[17];
                }
                "".length();
                if (0 != 0) {
                    return (true ^ true) & ((true ^ true) ^ true);
                }
            } else {
                int a2 = a();
                TileObject nearest2 = TileObjects.getNearest(tileObject2 -> {
                    if (lIIlII(tileObject2.getId(), a2)) {
                        ?? r0 = llIl[22];
                        "".length();
                        return "   ".length() <= (-" ".length()) ? (true ^ true) & ((true ^ true) ^ true) : r0;
                    }
                    return llIl[17];
                });
                if (lIIIlI(nearest2)) {
                    nearest2.interact(llIl[17]);
                    return llIl[17];
                }
            }
        }
        return llIl[17];
    }

    @Inject
    public c(MinerConfig minerConfig) {
        this.f = minerConfig;
    }

    private static boolean lIIIlI(Object obj) {
        return obj != null;
    }

    private static boolean lIIIIl(int i2) {
        return i2 != 0;
    }

    private static boolean lIIllI(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean lIIlII(int i2, int i3) {
        return i2 == i3;
    }

    private static void lllll() {
        llII = new String[llIl[24]];
        llII[llIl[17]] = lllIl("FgAs", "yrIoj");
        llII[llIl[22]] = lllIl("ABg0Fg==", "CwUzR");
        llII[llIl[23]] = llllI("749QQfhm490=", "WmXPL");
    }

    static {
        lIIIII();
        lllll();
    }

    private static void lIIIII() {
        llIl = new int[26];
        llIl[0] = (-641) & 36849;
        llIl[1] = (-((-3553) & 28131)) & (-129) & 60910;
        llIl[2] = (-((-3503) & 32191)) & (-517) & 65407;
        llIl[3] = (-641) & 36850;
        llIl[4] = (-((-11529) & 32665)) & (-8193) & 65535;
        llIl[5] = (-((-2409) & 23418)) & (-1) & 57215;
        llIl[6] = (-28811) & 65018;
        llIl[7] = (-20609) & 56813;
        llIl[8] = (-397) & 11773;
        llIl[9] = (-274) & 11647;
        llIl[10] = (-(((89 + 6) - 53) + 95)) & (-21009) & 32511;
        llIl[11] = (-((-589) & 4703)) & (-17026) & 32511;
        llIl[12] = (-((-11857) & 32603)) & (-529) & 32639;
        llIl[13] = (-((-2081) & 26725)) & (-257) & 28655;
        llIl[14] = (-28932) & 32739;
        llIl[15] = (((119 + 89) - 158) + 95) ^ (((53 + 79) - 118) + 127);
        llIl[16] = (176 ^ 172) ^ (110 ^ 100);
        llIl[17] = (202 ^ 131) & ((107 ^ 34) ^ (-1));
        llIl[18] = (-4457) & 8173;
        llIl[19] = (-12313) & 16095;
        llIl[20] = (209 ^ 182) ^ (116 ^ 72);
        llIl[21] = (206 ^ 155) ^ (64 ^ 81);
        llIl[22] = " ".length();
        llIl[23] = "  ".length();
        llIl[24] = "   ".length();
        llIl[25] = 80 ^ 88;
    }
}
