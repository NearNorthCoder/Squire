package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aG  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aG.class */
public abstract class aG extends Task {
    private final /* synthetic */ SquireFarmer cv;
    protected final /* synthetic */ SquireFarmerConfig ct;
    private static /* synthetic */ int[] llIIIlIIllII;
    private final /* synthetic */ F[] cw;
    protected final /* synthetic */ C0035j cu;

    private static boolean llllIlIIIlIlII(int i, int i2) {
        return i < i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public aG(SquireFarmer squireFarmer, SquireFarmerConfig squireFarmerConfig, C0035j c0035j, F... fArr) {
        this.cv = squireFarmer;
        this.ct = squireFarmerConfig;
        this.cu = c0035j;
        this.cw = fArr;
    }

    private static boolean llllIlIIIlIIlI(int i) {
        return i == 0;
    }

    private static void llllIlIIIlIIII() {
        llIIIlIIllII = new int[2];
        llIIIlIIllII[0] = (109 ^ 69) & ((5 ^ 45) ^ (-1));
        llIIIlIIllII[1] = " ".length();
    }

    static {
        llllIlIIIlIIII();
    }

    public abstract boolean f(E e);

    private static boolean llllIlIIIlIlIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean llllIlIIIlIIll(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v46, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v48, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v50, types: [boolean] */
    public boolean run() {
        if (!llllIlIIIlIIIl(this.cv.a(), EnumC0040o.BIRD_HOUSE) && !llllIlIIIlIIlI(this.ct.birdhouses_enabled() ? 1 : 0)) {
            E O = this.cu.O();
            if (llllIlIIIlIIll(O)) {
                return llIIIlIIllII[0];
            }
            int i = llIIIlIIllII[0];
            F[] fArr = this.cw;
            int length = fArr.length;
            int i2 = llIIIlIIllII[0];
            while (llllIlIIIlIlII(i2, length)) {
                if (llllIlIIIlIlIl(this.cu.b(O), fArr[i2])) {
                    i = llIIIlIIllII[1];
                }
                i2++;
                "".length();
                if ("  ".length() == "   ".length()) {
                    return ((118 ^ 104) ^ (159 ^ 190)) & (((((16 + 96) - 87) + 105) ^ (((177 + 107) - 150) + 55)) ^ (-" ".length()));
                }
            }
            return llllIlIIIlIIlI(i) ? llIIIlIIllII[0] : f(O);
        }
        return llIIIlIIllII[0];
    }

    private static boolean llllIlIIIlIIIl(Object obj, Object obj2) {
        return obj != obj2;
    }
}
