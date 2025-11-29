package r.m.p000.a.e.u.i.t.i.f.e.t.q.h.r.s.p001;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.tithefarm.SquireTitheFarm;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Refilling Watering Cans", priority = 100, blocking = true, register = true)
/* renamed from: r.m.-.a.e.u.i.t.i.f.e.t.q.h.r.s.-.t  reason: invalid package */
/* loaded from: afc9cf98-0627-4d2a-8a9e-4e9657a2fb2d.jar:r/m/-/a/e/u/i/t/i/f/e/t/q/h/r/s/-/t.class */
public class t extends r {
    private final /* synthetic */ SquireTitheFarm ab;
    private static /* synthetic */ String[] lIIllllllIIII;
    private /* synthetic */ boolean ac;
    private static /* synthetic */ int[] lIIllllllIIIl;

    private static boolean lIllIllIIIIlIII(int i, int i2) {
        return i < i2;
    }

    private static String lIllIllIIIIIlIl(String llllllllllllllIlllIIlIllllIlllIl, String llllllllllllllIlllIIlIllllIlllII) {
        String llllllllllllllIlllIIlIllllIlllIl2 = new String(Base64.getDecoder().decode(llllllllllllllIlllIIlIllllIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllIlllIIlIllllIllIll = new StringBuilder();
        char[] charArray = llllllllllllllIlllIIlIllllIlllII.toCharArray();
        int llllllllllllllIlllIIlIllllIllIIl = lIIllllllIIIl[1];
        char[] charArray2 = llllllllllllllIlllIIlIllllIlllIl2.toCharArray();
        int llllllllllllllIlllIIlIllllIlIIlI = charArray2.length;
        int i = lIIllllllIIIl[1];
        while (lIllIllIIIIlIII(i, llllllllllllllIlllIIlIllllIlIIlI)) {
            char llllllllllllllIlllIIlIllllIllllI = charArray2[i];
            llllllllllllllIlllIIlIllllIllIll.append((char) (llllllllllllllIlllIIlIllllIllllI ^ charArray[llllllllllllllIlllIIlIllllIllIIl % charArray.length]));
            "".length();
            llllllllllllllIlllIIlIllllIllIIl++;
            i++;
            "".length();
            if ((-" ".length()) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllIlllIIlIllllIllIll);
    }

    static {
        lIllIllIIIIIlll();
        lIllIllIIIIIllI();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIllIllIIIIlIIl(chatMessage.getMessage().contains(lIIllllllIIII[lIIllllllIIIl[0]]) ? 1 : 0)) {
            this.ac = lIIllllllIIIl[0];
            this.ab.b(lIIllllllIIIl[6]);
        }
    }

    private static boolean lIllIllIIIIlIIl(int i) {
        return i != 0;
    }

    private static void lIllIllIIIIIlll() {
        lIIllllllIIIl = new int[7];
        lIIllllllIIIl[0] = " ".length();
        lIIllllllIIIl[1] = (162 ^ 170) & ((56 ^ 48) ^ (-1));
        lIIllllllIIIl[2] = (-((-5665) & 24311)) & (-769) & 32767;
        lIIllllllIIIl[3] = (-8449) & 13779;
        lIIllllllIIIl[4] = "  ".length();
        lIIllllllIIIl[5] = (-((-14289) & 30714)) & (-12423) & 29679;
        lIIllllllIIIl[6] = (-((-1155) & 29847)) & (-1026) & 30717;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v35, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    public boolean run() {
        if (lIllIllIIIIlIII(this.Z.u(), this.Z.t())) {
            this.ac = lIIllllllIIIl[1];
            return lIIllllllIIIl[1];
        }
        int[] iArr = new int[lIIllllllIIIl[0]];
        iArr[lIIllllllIIIl[1]] = lIIllllllIIIl[2];
        if (lIllIllIIIIlIIl(Inventory.contains(iArr) ? 1 : 0) && lIllIllIIIIlIIl(this.ac ? 1 : 0)) {
            return lIIllllllIIIl[1];
        }
        int[] iArr2 = new int[lIIllllllIIIl[0]];
        iArr2[lIIllllllIIIl[1]] = lIIllllllIIIl[3];
        if (lIllIllIIIIlIlI(Inventory.contains(iArr2) ? 1 : 0)) {
            int[] iArr3 = new int[lIIllllllIIIl[0]];
            iArr3[lIIllllllIIIl[1]] = lIIllllllIIIl[2];
            if (lIllIllIIIIlIlI(Inventory.contains(iArr3) ? 1 : 0)) {
                return lIIllllllIIIl[1];
            }
        }
        SpellBook.Lunar lunar = SpellBook.Lunar.HUMIDIFY;
        if (lIllIllIIIIlIIl(Magic.canCast(lunar) ? 1 : 0)) {
            Magic.cast(lunar, lIIllllllIIIl[0], (boolean) lIIllllllIIIl[0]);
            this.ac = lIIllllllIIIl[0];
            return lIIllllllIIIl[0];
        }
        String[] strArr = new String[lIIllllllIIIl[0]];
        strArr[lIIllllllIIIl[1]] = lIIllllllIIII[lIIllllllIIIl[1]];
        TileObject nearest = TileObjects.getNearest(strArr);
        if (lIllIllIIIIlIll(nearest)) {
            return lIIllllllIIIl[1];
        }
        int[] iArr4 = new int[lIIllllllIIIl[4]];
        iArr4[lIIllllllIIIl[1]] = lIIllllllIIIl[3];
        iArr4[lIIllllllIIIl[0]] = lIIllllllIIIl[2];
        Inventory.getFirst(iArr4).useOn(nearest);
        return lIIllllllIIIl[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    @Inject
    protected t(SquireTitheFarm squireTitheFarm, i iVar) {
        super(iVar);
        this.ac = lIIllllllIIIl[0];
        this.ab = squireTitheFarm;
    }

    private static boolean lIllIllIIIIlIll(Object obj) {
        return obj == null;
    }

    private static boolean lIllIllIIIIlIlI(int i) {
        return i == 0;
    }

    private static boolean lIllIllIIIIllIl(int i, int i2) {
        return i == i2;
    }

    private static void lIllIllIIIIIllI() {
        lIIllllllIIII = new String[lIIllllllIIIl[4]];
        lIIllllllIIII[lIIllllllIIIl[1]] = lIllIllIIIIIlIl("Hg4RCTxpLQQePCwD", "IoelN");
        lIIllllllIIII[lIIllllllIIIl[0]] = lIllIllIIIIIlIl("Ah09MB8pAzEhVzZPNzIeZQYncxEpHTEyFDxPMiYcKQ==", "EoTSp");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (!lIllIllIIIIllII(animationChanged.getActor(), Players.getLocal()) && lIllIllIIIIllIl(animationChanged.getActor().getAnimation(), lIIllllllIIIl[5])) {
            this.ac = lIIllllllIIIl[0];
            this.ab.b(lIIllllllIIIl[6]);
        }
    }

    private static boolean lIllIllIIIIllII(Object obj, Object obj2) {
        return obj != obj2;
    }
}
