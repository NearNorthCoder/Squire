package s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.nightmare.SquireNightmareConfig;
import gg.squire.nightmare.SquireNightmarePlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Client;
import net.runelite.api.NPC;
import net.runelite.api.Skill;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.api.magic.SpellBook;
@TaskDesc(name = "Summon Thrall", priority = 150, register = true)
/* renamed from: s.i.e.i.m.r.-.q.e.g.h.u.n.t.r.a.aa  reason: invalid package and case insensitive filesystem */
/* loaded from: squire-nightmare-0.1.0.jar:s/i/e/i/m/r/-/q/e/g/h/u/n/t/r/a/aa.class */
public class C0001aa extends C {
    private static /* synthetic */ int[] llllIlIIIIll;
    /* synthetic */ boolean dC;
    /* synthetic */ boolean dD;
    private static /* synthetic */ String[] llllIlIIIIlI;

    private static boolean lIIlIIIIIllIIIl(int i, int i2) {
        return i == i2;
    }

    private static boolean lIIlIIIIIllIIll(int i, int i2) {
        return i != i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    @Inject
    protected C0001aa(C0013j c0013j, Client client, SquireNightmareConfig squireNightmareConfig, SquireNightmarePlugin squireNightmarePlugin) {
        super(c0013j, client, squireNightmareConfig, squireNightmarePlugin);
        this.dC = llllIlIIIIll[0];
        this.dD = llllIlIIIIll[0];
    }

    private static boolean lIIlIIIIIlIllll(int i) {
        return i != 0;
    }

    private static void lIIlIIIIIlIllIl() {
        llllIlIIIIll = new int[9];
        llllIlIIIIll[0] = " ".length();
        llllIlIIIIll[1] = (102 ^ 93) & ((96 ^ 91) ^ (-1));
        llllIlIIIIll[2] = (((36 + 30) - (-11)) + 81) ^ (((124 + 0) - 55) + 98);
        llllIlIIIIll[3] = "  ".length();
        llllIlIIIIll[4] = 125 ^ 25;
        llllIlIIIIll[5] = 156 ^ 154;
        llllIlIIIIll[6] = (-((-21057) & 22339)) & (-16897) & 30591;
        llllIlIIIIll[7] = (-(((45 + 73) - 88) + 100)) & (-16401) & 28667;
        llllIlIIIIll[8] = 36 ^ 44;
    }

    static {
        lIIlIIIIIlIllIl();
        lIIlIIIIIlIllII();
    }

    private static boolean lIIlIIIIIllIIlI(int i, int i2) {
        return i > i2;
    }

    private static boolean lIIlIIIIIlIlllI(Object obj) {
        return obj == null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        if (lIIlIIIIIllIIIl(varbitChanged.getVarbitId(), llllIlIIIIll[6]) && lIIlIIIIIllIIll(varbitChanged.getValue(), llllIlIIIIll[0])) {
            this.dC = llllIlIIIIll[0];
        }
        if (lIIlIIIIIllIIIl(varbitChanged.getVarbitId(), llllIlIIIIll[7]) && lIIlIIIIIllIIll(varbitChanged.getValue(), llllIlIIIIll[0])) {
            this.dD = llllIlIIIIll[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v30, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v32, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v37, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v47, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v27, types: [boolean] */
    @Override // s.i.e.i.m.r.p000.q.e.g.h.u.n.t.r.a.C
    public boolean bY() {
        NPC d = SquireNightmarePlugin.d();
        if (lIIlIIIIIlIlllI(d)) {
            return llllIlIIIIll[1];
        }
        String[] strArr = new String[llllIlIIIIll[0]];
        strArr[llllIlIIIIll[1]] = llllIlIIIIlI[llllIlIIIIll[1]];
        if (lIIlIIIIIlIllll(d.hasAction(strArr) ? 1 : 0)) {
            this.dC = llllIlIIIIll[0];
            this.dD = llllIlIIIIll[0];
        }
        String[] strArr2 = new String[llllIlIIIIll[0]];
        strArr2[llllIlIIIIll[1]] = llllIlIIIIlI[llllIlIIIIll[0]];
        if (lIIlIIIIIllIIII(d.hasAction(strArr2) ? 1 : 0)) {
            return llllIlIIIIll[1];
        }
        SpellBook.Necromancy necromancy = SpellBook.Necromancy.RESURRECT_GREATER_GHOST;
        if (lIIlIIIIIlIllll(cp() ? 1 : 0) && lIIlIIIIIlIllll(this.dC ? 1 : 0)) {
            Magic.cast(necromancy, llllIlIIIIll[1], llllIlIIIIll[2]);
            this.dC = llllIlIIIIll[1];
            sleep(llllIlIIIIll[3]);
            return llllIlIIIIll[0];
        }
        if ((!lIIlIIIIIllIIII(this.cQ ? 1 : 0) || !lIIlIIIIIllIIII(this.cR ? 1 : 0)) && !lIIlIIIIIllIIIl(Combat.getSpecEnergy(), llllIlIIIIll[4])) {
            SpellBook.Necromancy necromancy2 = SpellBook.Necromancy.DEATH_CHARGE;
            if (lIIlIIIIIlIllll(necromancy2.canCast() ? 1 : 0) && lIIlIIIIIlIllll(this.dD ? 1 : 0)) {
                Magic.cast(necromancy2, llllIlIIIIll[1], llllIlIIIIll[2]);
                this.dD = llllIlIIIIll[1];
                return llllIlIIIIll[0];
            }
            return llllIlIIIIll[1];
        }
        return llllIlIIIIll[1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean] */
    private boolean cp() {
        if (lIIlIIIIIlIllll(SpellBook.Necromancy.RESURRECT_GREATER_GHOST.canCast() ? 1 : 0) && lIIlIIIIIllIIlI(Skills.getBoostedLevel(Skill.PRAYER), llllIlIIIIll[5])) {
            ?? r0 = llllIlIIIIll[0];
            "".length();
            return " ".length() >= (59 ^ 63) ? (true ^ true) & ((true ^ true) ^ true) : r0;
        }
        return llllIlIIIIll[1];
    }

    private static String lIIlIIIIIlIlIll(String lllllllllllllllIIlIllIlllIIIlIlI, String lllllllllllllllIIlIllIlllIIIlIIl) {
        try {
            SecretKeySpec lllllllllllllllIIlIllIlllIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIIlIllIlllIIIlIIl.getBytes(StandardCharsets.UTF_8)), llllIlIIIIll[8]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(llllIlIIIIll[3], lllllllllllllllIIlIllIlllIIIllIl);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllllllllllllllIIlIllIlllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllllllllllllllIIlIllIlllIIIlIll) {
            lllllllllllllllIIlIllIlllIIIlIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIIIIIllIIII(int i) {
        return i == 0;
    }

    private static void lIIlIIIIIlIllII() {
        llllIlIIIIlI = new String[llllIlIIIIll[3]];
        llllIlIIIIlI[llllIlIIIIll[1]] = lIIlIIIIIlIlIll("7XGaN6QU2j4=", "wgRsO");
        llllIlIIIIlI[llllIlIIIIll[0]] = lIIlIIIIIlIlIll("W60yO5H166I=", "KSkPG");
    }
}
