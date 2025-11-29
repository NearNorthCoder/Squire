package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import java.util.Map;
import net.runelite.api.GameState;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Equipment;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.pathfinder.model.BankLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Banking for herb run seeds", priority = 1000, blocking = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aD  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aD.class */
public class aD extends Task {
    private final /* synthetic */ SquireFarmerConfig ck;
    private static /* synthetic */ int[] lIllllIIlIII;
    private final /* synthetic */ C0031f cm;
    private static final /* synthetic */ Logger cj;
    private final /* synthetic */ SquireFarmer cl;
    private static /* synthetic */ String[] lIllllIIIlll;

    static {
        lllIllIllllIII();
        lllIllIlllIlll();
        cj = LoggerFactory.getLogger(aD.class);
    }

    private static boolean lllIllIllllllI(int i, int i2) {
        return i == i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0116  */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v34, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v58, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v64, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v89, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean run() {
        int i;
        int lllllllllllllllIlIllIIlllIlIIIIl;
        Iterator<Integer> it;
        if (lllIllIllllIIl(this.cl.a(), EnumC0040o.HERBS)) {
            return lIllllIIlIII[0];
        }
        if (!lllIllIllllIlI(Game.getState(), GameState.LOGGED_IN) || lllIllIllllIll(Players.getLocal().isAnimating() ? 1 : 0)) {
            return lIllllIIlIII[0];
        }
        Map<Integer, Integer> F = this.cm.F();
        if (lllIllIllllIll(F.isEmpty() ? 1 : 0)) {
            return lIllllIIlIII[0];
        }
        if (lllIllIllllIll(Bank.isOpen() ? 1 : 0)) {
            int[] iArr = new int[lIllllIIlIII[1]];
            iArr[lIllllIIlIII[0]] = lIllllIIlIII[2];
            if (lllIllIlllllII(Inventory.contains(iArr) ? 1 : 0)) {
                int[] iArr2 = new int[lIllllIIlIII[1]];
                iArr2[lIllllIIlIII[0]] = lIllllIIlIII[2];
                if (!lllIllIllllIll(Equipment.contains(iArr2) ? 1 : 0)) {
                    i = lIllllIIlIII[0];
                    lllllllllllllllIlIllIIlllIlIIIIl = i;
                    if (lllIllIlllllII(lllllllllllllllIlIllIIlllIlIIIIl)) {
                        int[] iArr3 = new int[lIllllIIlIII[1]];
                        iArr3[lIllllIIlIII[0]] = lIllllIIlIII[2];
                        if (lllIllIllllIll(Bank.contains(iArr3) ? 1 : 0)) {
                            Bank.withdraw(lIllllIIlIII[2], lIllllIIlIII[1], Bank.WithdrawMode.ITEM);
                            return lIllllIIlIII[1];
                        }
                    }
                    it = F.keySet().iterator();
                    if (lllIllIllllIll(it.hasNext() ? 1 : 0)) {
                        Integer next = it.next();
                        Integer num = F.get(next);
                        ?? r0 = lIllllIIlIII[1];
                        int[] iArr4 = new int[lIllllIIlIII[1]];
                        iArr4[lIllllIIlIII[0]] = next.intValue();
                        if (!lllIllIlllllIl(Bank.getCount((boolean) r0, iArr4), num.intValue())) {
                            Bank.withdrawAll(next.intValue(), Bank.WithdrawMode.ITEM);
                            return lIllllIIlIII[1];
                        }
                        cj.info(lIllllIIIlll[lIllllIIlIII[0]], next);
                        this.cl.forceStop();
                        return lIllllIIlIII[1];
                    }
                }
            }
            i = lIllllIIlIII[1];
            "".length();
            if (0 != 0) {
                return ((56 ^ 19) ^ (61 ^ 26)) & (((107 ^ 117) ^ (127 ^ 109)) ^ (-" ".length()));
            }
            lllllllllllllllIlIllIIlllIlIIIIl = i;
            if (lllIllIlllllII(lllllllllllllllIlIllIIlllIlIIIIl)) {
            }
            it = F.keySet().iterator();
            if (lllIllIllllIll(it.hasNext() ? 1 : 0)) {
            }
        }
        if (lllIllIllllIll(F.keySet().stream().noneMatch(num2 -> {
            EnumC0020at[] values = EnumC0020at.values();
            int length = values.length;
            int i2 = lIllllIIlIII[0];
            while (lllIllIlllllIl(i2, length)) {
                EnumC0020at enumC0020at = values[i2];
                if (lllIllIllllIIl(enumC0020at, EnumC0020at.NOTHING)) {
                    if (lllIllIllllIlI(enumC0020at, EnumC0020at.DEFAULT)) {
                        "".length();
                        if ((((((83 + 133) - 84) + 15) ^ (((83 + 81) - 155) + 173)) & (((79 ^ 39) ^ (248 ^ 181)) ^ (-" ".length()))) != 0) {
                            return ((((94 + 75) - 63) + 30) ^ (((154 + 166) - 249) + 96)) & (((132 ^ 161) ^ (32 ^ 42)) ^ (-" ".length()));
                        }
                    } else if (lllIllIllllllI(enumC0020at.bf().aA(), num2.intValue())) {
                        return lIllllIIlIII[1];
                    }
                }
                i2++;
                "".length();
                if ((((123 ^ 108) ^ (137 ^ 196)) & (((((20 + 128) - 14) + 104) ^ (((55 + 138) - 135) + 122)) ^ (-" ".length()))) != 0) {
                    return ((((223 + 9) - 175) + 186) ^ (((29 + 118) - (-7)) + 12)) & (((((60 + 156) - 114) + 113) ^ (((113 + 25) - 20) + 12)) ^ (-" ".length()));
                }
            }
            if (lllIllIllllllI(num2.intValue(), EnumC0024ax.GIANT_SEAWEED.bf().aA())) {
                ?? r02 = lIllllIIlIII[1];
                "".length();
                return " ".length() == (((81 ^ 18) ^ (109 ^ 55)) & (((146 ^ 159) ^ (96 ^ 116)) ^ (-" ".length()))) ? ((133 ^ 161) ^ (195 ^ 175)) & (((245 ^ 136) ^ (246 ^ 195)) ^ (-" ".length())) : r02;
            }
            return lIllllIIlIII[0];
        }) ? 1 : 0)) {
            return lIllllIIlIII[0];
        }
        if (lllIllIllllIll(Bank.open() ? 1 : 0)) {
            return lIllllIIlIII[1];
        }
        Movement.walkTo(BankLocation.getNearestCommon());
        "".length();
        return lIllllIIlIII[1];
    }

    private static boolean lllIllIllllIll(int i) {
        return i != 0;
    }

    private static boolean lllIllIllllIIl(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllIllIlllllIl(int i, int i2) {
        return i < i2;
    }

    private static String lllIllIlllIllI(String lllllllllllllllIlIllIIlllIIIlIIl, String lllllllllllllllIlIllIIlllIIIlIII) {
        String str = new String(Base64.getDecoder().decode(lllllllllllllllIlIllIIlllIIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlIllIIlllIIIIlll = new StringBuilder();
        char[] charArray = lllllllllllllllIlIllIIlllIIIlIII.toCharArray();
        int lllllllllllllllIlIllIIlllIIIIlIl = lIllllIIlIII[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllllIIlIII[0];
        while (lllIllIlllllIl(i, length)) {
            lllllllllllllllIlIllIIlllIIIIlll.append((char) (charArray2[i] ^ charArray[lllllllllllllllIlIllIIlllIIIIlIl % charArray.length]));
            "".length();
            lllllllllllllllIlIllIIlllIIIIlIl++;
            i++;
            "".length();
            if (" ".length() <= (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllllIlIllIIlllIIIIlll);
    }

    @Inject
    public aD(SquireFarmerConfig squireFarmerConfig, SquireFarmer squireFarmer, C0031f c0031f) {
        this.ck = squireFarmerConfig;
        this.cl = squireFarmer;
        this.cm = c0031f;
    }

    private static void lllIllIlllIlll() {
        lIllllIIIlll = new String[lIllllIIlIII[1]];
        lIllllIIIlll[lIllllIIlIII[0]] = lllIllIlllIllI("NzIYFjgNKBBGKwUzBANoEyNXBzoBZhgTPEQpEUY7ASMTRmAXIxICaA0iV1toHzte", "dFwfH");
    }

    private static void lllIllIllllIII() {
        lIllllIIlIII = new int[3];
        lIllllIIlIII[0] = ((50 ^ 18) ^ (232 ^ 169)) & (((20 ^ 49) ^ (11 ^ 79)) ^ (-" ".length()));
        lIllllIIlIII[1] = " ".length();
        lIllllIIlIII[2] = (-8197) & 15605;
    }

    private static boolean lllIllIllllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllIllIlllllII(int i) {
        return i == 0;
    }
}
