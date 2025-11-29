package p000.m.e.a.u.s.r.r.q.i.r.e.f;

import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.farmer.SquireFarmer;
import gg.squire.farmer.SquireFarmerConfig;
import java.awt.Canvas;
import java.time.Instant;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.GameThread;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.input.Mouse;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Waiting logged out", priority = Integer.MAX_VALUE, blocking = true, register = true)
/* renamed from: -.m.e.a.u.s.r.r.q.i.r.e.f.aA  reason: invalid package */
/* loaded from: 99cb6034-aaf0-4ea3-9488-bd66257fa44c.jar:-/m/e/a/u/s/r/r/q/i/r/e/f/aA.class */
public class aA extends Task {
    private /* synthetic */ Instant cb;
    private /* synthetic */ String ca;
    private final /* synthetic */ SquireFarmerConfig bX;
    private static /* synthetic */ int[] llIIIlIIlllI;
    private /* synthetic */ String bZ;
    private final /* synthetic */ SquireFarmer bV;
    private final /* synthetic */ Client bY;
    private final /* synthetic */ C0031f bW;
    private static final /* synthetic */ Logger bU;

    private void bn() {
        new Thread(() -> {
            do {
                try {
                    Thread.sleep(2000L);
                    "".length();
                    if ((152 ^ 156) < "  ".length()) {
                        return;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bo();
            } while (!llllIlIIIllIII(Game.isOnLoginScreen() ? 1 : 0));
        }).start();
    }

    static {
        llllIlIIIlIllI();
        bU = LoggerFactory.getLogger(aA.class);
    }

    private static boolean llllIlIIIllIIl(Object obj) {
        return obj == null;
    }

    @Inject
    public aA(SquireFarmer squireFarmer, C0031f c0031f, SquireFarmerConfig squireFarmerConfig, Client client) {
        this.bV = squireFarmer;
        this.bW = c0031f;
        this.bX = squireFarmerConfig;
        this.bY = client;
    }

    private static boolean llllIlIIIllIII(int i) {
        return i == 0;
    }

    private static boolean llllIlIIIllIll(int i) {
        return i != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v36, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v69, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v71, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public boolean run() {
        if (llllIlIIIllIII(this.bX.log() ? 1 : 0)) {
            return llIIIlIIlllI[1];
        }
        if (llllIlIIIllIIl(this.bV.a()) && llllIlIIIllIlI(this.bY.getGameState(), GameState.LOGIN_SCREEN)) {
            this.bY.setUsername(this.bZ);
            this.bY.setPassword(this.ca);
            return llIIIlIIlllI[0];
        } else if (!llllIlIIIllIll(this.bV.c() ? 1 : 0) || !llllIlIIIllIlI(this.bY.getGameState(), GameState.LOGIN_SCREEN)) {
            this.bZ = this.bY.getUsername();
            this.ca = this.bY.getPassword();
            if (llllIlIIIllIIl(this.bV.a())) {
                Game.logout();
                bn();
                return llIIIlIIlllI[0];
            }
            return llIIIlIIlllI[1];
        } else {
            if (llllIlIIIllIll(bm() ? 1 : 0)) {
                Canvas canvas = Static.getClient().getCanvas();
                Mouse.click(canvas.getWidth() / llIIIlIIlllI[2], canvas.getHeight() / llIIIlIIlllI[2], (boolean) llIIIlIIlllI[1]);
                GameThread.invoke(() -> {
                    this.bY.setGameState(llIIIlIIlllI[3]);
                });
                "".length();
                if ((((((160 + 39) - 127) + 100) ^ (((18 + 87) - (-42)) + 14)) & (((121 ^ 113) ^ (27 ^ 30)) ^ (-" ".length()))) != 0) {
                    return ((41 ^ 25) ^ (203 ^ 162)) & (((50 ^ 116) ^ (181 ^ 170)) ^ (-" ".length()));
                }
            } else {
                this.bY.setUsername(this.bZ);
                this.bY.setPassword(this.ca);
                this.bY.setLoginIndex(llIIIlIIlllI[2]);
                Keyboard.sendEnter();
                Keyboard.sendEnter();
            }
            return llIIIlIIlllI[0];
        }
    }

    private static void llllIlIIIlIllI() {
        llIIIlIIlllI = new int[4];
        llIIIlIIlllI[0] = " ".length();
        llIIIlIIlllI[1] = ((225 ^ 194) ^ (216 ^ 181)) & (((14 ^ 38) ^ (22 ^ 112)) ^ (-" ".length()));
        llIIIlIIlllI[2] = "  ".length();
        llIIIlIIlllI[3] = (240 ^ 195) ^ (114 ^ 85);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    public void bo() {
        if (llllIlIIIllIII(this.bV.c() ? 1 : 0) && llllIlIIIllIlI(this.bY.getGameState(), GameState.LOGIN_SCREEN)) {
            this.bY.setUsername(this.bZ);
            this.bY.setPassword(this.ca);
        } else if (llllIlIIIllIll(this.bV.c() ? 1 : 0) && llllIlIIIllIlI(this.bY.getGameState(), GameState.LOGIN_SCREEN)) {
            if (!llllIlIIIllIll(bm() ? 1 : 0)) {
                this.bY.setUsername(this.bZ);
                this.bY.setPassword(this.ca);
                this.bY.setLoginIndex(llIIIlIIlllI[2]);
                Keyboard.sendEnter();
                Keyboard.sendEnter();
                return;
            }
            Canvas canvas = Static.getClient().getCanvas();
            Mouse.click(canvas.getWidth() / llIIIlIIlllI[2], canvas.getHeight() / llIIIlIIlllI[2], (boolean) llIIIlIIlllI[1]);
            GameThread.invoke(() -> {
                this.bY.setGameState(llIIIlIIlllI[3]);
            });
            "".length();
            if (((121 ^ 19) ^ (56 ^ 86)) <= (((((145 + 117) - 111) + 3) ^ (((155 + 120) - 137) + 61)) & (((((119 + 144) - 201) + 92) ^ (((39 + 3) - (-68)) + 89)) ^ (-" ".length())))) {
            }
        }
    }

    private static boolean llllIlIIIllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    private static boolean bm() {
        if (llllIlIIIlIlll(Static.getClient().getJagexDisplayName()) && llllIlIIIllIII(Static.getClient().getJagexDisplayName().isEmpty() ? 1 : 0)) {
            ?? r0 = llIIIlIIlllI[0];
            "".length();
            return " ".length() >= ((145 ^ 164) ^ (37 ^ 20)) ? ((((57 + 158) - 129) + 86) ^ (((154 + 83) - 181) + 125)) & (((197 ^ 130) ^ (75 ^ 21)) ^ (-" ".length())) : r0;
        }
        return llIIIlIIlllI[1];
    }

    private static boolean llllIlIIIlIlll(Object obj) {
        return obj != null;
    }
}
