package e.q.u.d.w.s.p.e.e.c.s.h.i.p000.l.r.p001.r.l.a.o.h.u.l.e;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import gg.squire.sepulchre.SquireSepulchre;
import gg.squire.sepulchre.SquireSepulchreConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.events.InventoryChanged;
@Singleton
/* renamed from: e.q.u.d.w.s.p.e.e.c.s.h.i.-.l.r.-.r.l.a.o.h.u.l.e.d  reason: invalid package and case insensitive filesystem */
/* loaded from: 2fcaa9ca-dfa8-475d-992d-ba368c0c843d.jar:e/q/u/d/w/s/p/e/e/c/s/h/i/-/l/r/-/r/l/a/o/h/u/l/e/d.class */
public class C0003d {
    private /* synthetic */ HashMap<TileObject, J> R = new HashMap<>();
    private final /* synthetic */ SquireSepulchreConfig P;
    private final /* synthetic */ SquireSepulchre Q;
    private static /* synthetic */ int[] lllIIIIlllII;
    private static /* synthetic */ String[] lllIIIIllIll;

    private static boolean lIIIlIIIllIIIll(int i) {
        return i == 0;
    }

    @Subscribe(priority = -2.1474836E9f)
    public void a(GameTick gameTick) {
        List<TileObject> all = TileObjects.getAll(tileObject -> {
            if (!lIIIlIIIllIIIll(tileObject.getName().toLowerCase().contains(lllIIIIllIll[lllIIIIlllII[0]]) ? 1 : 0) || lIIIlIIIllIIIIl(tileObject.getName().toLowerCase().contains(lllIIIIllIll[lllIIIIlllII[1]]) ? 1 : 0)) {
                ?? r0 = lllIIIIlllII[1];
                "".length();
                return "   ".length() == 0 ? ((6 ^ 10) ^ (241 ^ 175)) & (((147 ^ 179) ^ (235 ^ 153)) ^ (-" ".length())) : r0;
            }
            return lllIIIIlllII[0];
        });
        int i = lllIIIIlllII[0];
        for (TileObject tileObject2 : all) {
            if (lIIIlIIIllIIIlI(tileObject2)) {
                "".length();
                if ((2 ^ 6) < 0) {
                    return;
                }
            } else {
                if (lIIIlIIIllIIIll(this.R.containsKey(tileObject2) ? 1 : 0)) {
                    J j = new J(tileObject2);
                    j.aE();
                    i++;
                    this.R.put(tileObject2, j);
                    "".length();
                }
                this.R.get(tileObject2).aE();
                "".length();
                if ("   ".length() == ((33 ^ 97) ^ (91 ^ 31))) {
                    return;
                }
            }
        }
        if (lIIIlIIIllIIIIl(i)) {
            System.out.println("Added " + i + " obstacles to the map");
        }
    }

    public void q() {
        this.R.clear();
    }

    private static void lIIIlIIIlIllllI() {
        lllIIIIllIll = new String[lllIIIIlllII[2]];
        lllIIIIllIll[lllIIIIlllII[0]] = lIIIlIIIlIlllIl("IioVExkxYxwGCiE2Cg==", "UCork");
        lllIIIIllIll[lllIIIIlllII[1]] = lIIIlIIIlIlllIl("Mzw/DQksciUeACwnMw==", "XRVja");
    }

    @Subscribe
    public void a(InventoryChanged inventoryChanged) {
        if (lIIIlIIIllIIIII(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_ADDED)) {
        }
    }

    private static boolean lIIIlIIIllIIIlI(Object obj) {
        return obj == null;
    }

    private static boolean lIIIlIIIllIIlII(int i, int i2) {
        return i < i2;
    }

    private static boolean lIIIlIIIllIIIIl(int i) {
        return i != 0;
    }

    static {
        lIIIlIIIlIlllll();
        lIIIlIIIlIllllI();
    }

    public J b(TileObject tileObject) {
        if (lIIIlIIIllIIIIl(this.R.containsKey(tileObject) ? 1 : 0)) {
            return this.R.get(tileObject);
        }
        return null;
    }

    private static boolean lIIIlIIIllIIIII(Object obj, Object obj2) {
        return obj == obj2;
    }

    public void r() {
        this.R.clear();
    }

    private static void lIIIlIIIlIlllll() {
        lllIIIIlllII = new int[3];
        lllIIIIlllII[0] = ((((111 + 133) - 172) + 77) ^ (((68 + 21) - 32) + 113)) & (((((19 + 73) - (-40)) + 14) ^ (((40 + 35) - 42) + 140)) ^ (-" ".length()));
        lllIIIIlllII[1] = " ".length();
        lllIIIIlllII[2] = "  ".length();
    }

    private static String lIIIlIIIlIlllIl(String lllllllllllllllIIlllIIIIIlllIIlI, String lllllllllllllllIIlllIIIIIlllIIIl) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIIlllIIIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIIlllIIIIIlllIIII = new StringBuilder();
        char[] lllllllllllllllIIlllIIIIIllIllll = lllllllllllllllIIlllIIIIIlllIIIl.toCharArray();
        int lllllllllllllllIIlllIIIIIllIlllI = lllIIIIlllII[0];
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = lllIIIIlllII[0];
        while (lIIIlIIIllIIlII(i, length)) {
            lllllllllllllllIIlllIIIIIlllIIII.append((char) (charArray[i] ^ lllllllllllllllIIlllIIIIIllIllll[lllllllllllllllIIlllIIIIIllIlllI % lllllllllllllllIIlllIIIIIllIllll.length]));
            "".length();
            lllllllllllllllIIlllIIIIIllIlllI++;
            i++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIIlllIIIIIlllIIII);
    }

    @Inject
    C0003d(SquireSepulchreConfig squireSepulchreConfig, SquireSepulchre squireSepulchre) {
        this.Q = squireSepulchre;
        this.P = squireSepulchreConfig;
    }
}
