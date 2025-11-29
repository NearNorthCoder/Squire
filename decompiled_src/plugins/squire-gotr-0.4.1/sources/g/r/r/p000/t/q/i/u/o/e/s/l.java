package g.r.r.p000.t.q.i.u.o.e.s;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.runecrafting.SquireGOTRPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameObject;
import net.runelite.api.GameState;
import net.runelite.api.Player;
import net.runelite.api.Skill;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.commons.Rand;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Game;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.movement.Reachable;
@TaskDesc(name = "Mining inital fragments", priority = 12, register = true, blocking = true)
/* renamed from: g.r.r.-.t.q.i.u.o.e.s.l  reason: invalid package */
/* loaded from: squire-gotr-0.4.1.jar:g/r/r/-/t/q/i/u/o/e/s/l.class */
public class l extends h {
    private static /* synthetic */ String[] llIIlllIlIII;
    private /* synthetic */ boolean bd;
    private static /* synthetic */ int[] llIIlllIlIIl;
    protected static final /* synthetic */ WorldPoint bc;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean aj() {
        if (lllllllIlIIIIl(this.aV.m(), EnumC0002c.ACTIVATING)) {
            this.bd = llIIlllIlIIl[2];
        }
        return llIIlllIlIIl[1];
    }

    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (!lllllllIlIIIlI(chatMessage.getType(), ChatMessageType.GAMEMESSAGE) && lllllllIlIIIll(chatMessage.getMessage().contains(llIIlllIlIII[llIIlllIlIIl[2]]) ? 1 : 0)) {
            sleep(Rand.nextInt(llIIlllIlIIl[7], llIIlllIlIIl[8]));
        }
    }

    private static void lllllllIIlllll() {
        llIIlllIlIII = new String[llIIlllIlIIl[3]];
        llIIlllIlIII[llIIlllIlIIl[1]] = lllllllIIllllI("o7K8ZamEuFY=", "LQmfo");
        llIIlllIlIII[llIIlllIlIIl[2]] = lllllllIIllllI("au+Y+378OQmESvW1bUPWLA==", "ZeHIk");
    }

    private static void lllllllIlIIIII() {
        llIIlllIlIIl = new int[11];
        llIIlllIlIIl[0] = "   ".length();
        llIIlllIlIIl[1] = (27 ^ 72) & ((236 ^ 191) ^ (-1));
        llIIlllIlIIl[2] = " ".length();
        llIIlllIlIIl[3] = "  ".length();
        llIIlllIlIIl[4] = 156 ^ 164;
        llIIlllIlIIl[5] = (-21817) & 65535;
        llIIlllIlIIl[6] = (-((-11473) & 28155)) & (-5121) & 65519;
        llIIlllIlIIl[7] = (((57 + 135) - 174) + 133) ^ (((42 + 108) - 3) + 0);
        llIIlllIlIIl[8] = 9 ^ 1;
        llIIlllIlIIl[9] = (-((-3900) & 16319)) & (-81) & 16127;
        llIIlllIlIIl[10] = (-17090) & 26581;
    }

    private static boolean lllllllIlIIllI(int i, int i2) {
        return i >= i2;
    }

    static {
        lllllllIlIIIII();
        lllllllIIlllll();
        bc = new WorldPoint(llIIlllIlIIl[9], llIIlllIlIIl[10], llIIlllIlIIl[1]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l(SquireGOTRPlugin squireGOTRPlugin) {
        super(squireGOTRPlugin, r2);
        EnumC0002c[] enumC0002cArr = new EnumC0002c[llIIlllIlIIl[0]];
        enumC0002cArr[llIIlllIlIIl[1]] = EnumC0002c.ACTIVATING;
        enumC0002cArr[llIIlllIlIIl[2]] = EnumC0002c.COUNTDOWN;
        enumC0002cArr[llIIlllIlIIl[3]] = EnumC0002c.ACTIVE;
    }

    private static boolean lllllllIlIIIIl(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lllllllIlIIlII(int i) {
        return i == 0;
    }

    private static boolean lllllllIlIIlIl(int i, int i2) {
        return i > i2;
    }

    private static boolean lllllllIlIIIll(int i) {
        return i != 0;
    }

    private static String lllllllIIllllI(String lllllllllllllllIlIIlIllllIIIIlII, String lllllllllllllllIlIIlIllllIIIIIll) {
        try {
            SecretKeySpec lllllllllllllllIlIIlIllllIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlIIlIllllIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlIIlIllllIIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllllIlIIlIllllIIIIllI.init(llIIlllIlIIl[3], lllllllllllllllIlIIlIllllIIIIlll);
            return new String(lllllllllllllllIlIIlIllllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllllIlIIlIllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIlIIlIllllIIIIlIl) {
            lllllllllllllllIlIIlIllllIIIIlIl.printStackTrace();
            return null;
        }
    }

    private static boolean lllllllIlIIIlI(Object obj, Object obj2) {
        return obj != obj2;
    }

    private static boolean lllllllIlIIlll(Object obj) {
        return obj == null;
    }

    private static boolean lllllllIlIlIII(Object obj) {
        return obj != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v49, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v54, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v66, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v70, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v80, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v83, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v86, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v88, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v90, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v42, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v45, types: [boolean] */
    @Override // g.r.r.p000.t.q.i.u.o.e.s.h
    protected boolean ak() {
        GameObject nearest;
        if (!lllllllIlIIIlI(Game.getState(), GameState.LOGGED_IN) && !lllllllIlIIIll(SquireGOTRPlugin.f0g.contains(Players.getLocal()) ? 1 : 0)) {
            if (lllllllIlIIlII(this.aV.g() ? 1 : 0)) {
                this.bd = llIIlllIlIIl[1];
                return llIIlllIlIIl[1];
            } else if (lllllllIlIIlIl(this.aV.a(), this.aW.fragmentAmount())) {
                this.bd = llIIlllIlIIl[1];
                return llIIlllIlIIl[1];
            } else if (lllllllIlIIlII(this.bd ? 1 : 0)) {
                return llIIlllIlIIl[1];
            } else {
                if (lllllllIlIIllI(Skills.getLevel(Skill.AGILITY), llIIlllIlIIl[4])) {
                    int[] iArr = new int[llIIlllIlIIl[2]];
                    iArr[llIIlllIlIIl[1]] = llIIlllIlIIl[5];
                    nearest = TileObjects.getNearest(iArr);
                    "".length();
                    if ((((((132 + 77) - 104) + 76) ^ (((132 + 135) - 229) + 126)) & (((((173 + 154) - 183) + 44) ^ (((51 + 147) - 150) + 125)) ^ (-" ".length()))) != 0) {
                        return ((192 ^ 154) ^ (30 ^ 125)) & (((((81 + 107) - 138) + 95) ^ (((119 + 19) - 105) + 135)) ^ (-" ".length()));
                    }
                } else {
                    int[] iArr2 = new int[llIIlllIlIIl[2]];
                    iArr2[llIIlllIlIIl[1]] = llIIlllIlIIl[6];
                    nearest = TileObjects.getNearest(iArr2);
                }
                GameObject gameObject = nearest;
                if (lllllllIlIIlll(gameObject)) {
                    if (lllllllIlIIlII(Movement.isWalking() ? 1 : 0)) {
                        Movement.walkTo(bc);
                        "".length();
                        return llIIlllIlIIl[2];
                    }
                    return llIIlllIlIIl[2];
                }
                Player local = Players.getLocal();
                boolean isInteractable = Reachable.isInteractable(gameObject);
                if (lllllllIlIIIll(ah() ? 1 : 0) && lllllllIlIIlII(isInteractable ? 1 : 0) && lllllllIlIIlII(local.isAnimating() ? 1 : 0)) {
                    Movement.walkTo(gameObject.getWorldLocation());
                    "".length();
                    return llIIlllIlIIl[2];
                } else if (lllllllIlIIlII(isInteractable ? 1 : 0)) {
                    return llIIlllIlIIl[2];
                } else {
                    if (lllllllIlIIIll(Players.getLocal().isAnimating() ? 1 : 0) && lllllllIlIIIll(this.bd ? 1 : 0)) {
                        return llIIlllIlIIl[2];
                    }
                    if (!lllllllIlIlIII(this.aV.L()) || lllllllIlIIlII(b(gameObject) ? 1 : 0)) {
                        gameObject.interact(llIIlllIlIII[llIIlllIlIIl[1]]);
                        sleep(llIIlllIlIIl[3]);
                        return llIIlllIlIIl[2];
                    }
                    return llIIlllIlIIl[2];
                }
            }
        }
        return llIIlllIlIIl[1];
    }
}
