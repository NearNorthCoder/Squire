package y.l.q.i.p000.g.u.s.r.e.t.a.i.i;

import com.google.inject.Inject;
import gg.squire.client.plugins.fw.Task;
import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.client.util.Log;
import gg.squire.plugins.agility.AgilityConfig;
import gg.squire.plugins.agility.SquireAgilityPlugin;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.Skill;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.game.Combat;
import net.unethicalite.api.game.Skills;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.query.items.ItemQuery;
import net.unethicalite.api.query.results.ItemQueryResults;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@TaskDesc(name = "Consuming")
/* renamed from: y.l.q.i.-.g.u.s.r.e.t.a.i.i.d  reason: invalid package */
/* loaded from: 29a54919-2e79-4bd5-923c-285f5cdb7f9a.jar:y/l/q/i/-/g/u/s/r/e/t/a/i/i/d.class */
public class d extends Task {
    private static final /* synthetic */ Logger q;
    private static /* synthetic */ int[] lIllIIlIIII;
    private static /* synthetic */ String[] lIllIIIlIlI;
    private final /* synthetic */ AgilityConfig s;
    private final /* synthetic */ SquireAgilityPlugin r;

    private static String lIIlIlIlIIlllI(String llllllllllllllllIlIlIlIIIIIllIll, String llllllllllllllllIlIlIlIIIIIllIlI) {
        try {
            SecretKeySpec llllllllllllllllIlIlIlIIIIIllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIIIIIllIlI.getBytes(StandardCharsets.UTF_8)), lIllIIlIIII[10]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIllIIlIIII[3], llllllllllllllllIlIlIlIIIIIllllI);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlIIIIIlllII) {
            llllllllllllllllIlIlIlIIIIIlllII.printStackTrace();
            return null;
        }
    }

    private boolean u() {
        return Inventory.contains(item -> {
            return item.getName().startsWith(lIllIIIlIlI[lIllIIlIIII[6]]);
        });
    }

    static {
        lIIlIlIllIlIll();
        lIIlIlIlIlIlII();
        q = LoggerFactory.getLogger(d.class);
    }

    private static boolean lIIlIlIlllIIIl(Object obj) {
        return obj == null;
    }

    private static boolean lIIlIlIllIllIl(int i) {
        return i != 0;
    }

    private static int lIIlIlIllIllII(double d, double d2) {
        return (d > d2 ? 1 : (d == d2 ? 0 : -1));
    }

    private static boolean lIIlIlIllIlllI(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean] */
    private boolean t() {
        b course;
        if (lIIlIlIllIllIl(this.s.progressive() ? 1 : 0)) {
            course = b.j();
            "".length();
            if ((25 ^ 29) == " ".length()) {
                return (true ^ true) & ((true ^ true) ^ true);
            }
        } else {
            course = this.s.course();
        }
        if (lIIlIlIlllIIlI(course, b.ARDOUGNE) && lIIlIlIllIllll(Skills.getBoostedLevel(Skill.AGILITY), lIllIIlIIII[5])) {
            ?? r0 = lIllIIlIIII[2];
            "".length();
            return "   ".length() != "   ".length() ? ((((58 + 133) - 51) + 34) ^ (((115 + 41) - 98) + 113)) & (((((91 + 12) - (-45)) + 47) ^ (((125 + 195) - 277) + 155)) ^ (-" ".length())) : r0;
        }
        return lIllIIlIIII[1];
    }

    private static String lIIlIlIlIlIIII(String llllllllllllllllIlIlIlIIIlIIIIII, String llllllllllllllllIlIlIlIIIIllllIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllllIlIlIlIIIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIllIIlIIII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllllllllllllIlIlIlIIIlIIIIIl) {
            llllllllllllllllIlIlIlIIIlIIIIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIlIlIllIllll(int i, int i2) {
        return i < i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v25, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v31, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v45, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v55, types: [boolean] */
    public boolean run() {
        ItemQuery actions;
        if (lIIlIlIllIllIl(u() ? 1 : 0) && lIIlIlIllIlllI(Movement.isStaminaBoosted() ? 1 : 0) && lIIlIlIllIllll(Movement.getRunEnergy(), lIllIIlIIII[0])) {
            Inventory.getFirst(item -> {
                return item.getName().startsWith(lIllIIIlIlI[lIllIIlIIII[8]]);
            }).interact(lIllIIIlIlI[lIllIIlIIII[1]]);
            return lIllIIlIIII[2];
        }
        boolean t = t();
        if ((!lIIlIlIlllIIII(lIIlIlIllIllII(Combat.getHealthPercent(), this.s.stopAtHp())) || lIIlIlIllIllIl(t ? 1 : 0)) && !lIIlIlIllIllIl(Players.getLocal().isAnimating() ? 1 : 0)) {
            ItemQuery query = Inventory.query();
            if (lIIlIlIllIllIl(t ? 1 : 0)) {
                actions = (ItemQuery) query.filter(item2 -> {
                    return item2.getName().toLowerCase().contains(lIllIIIlIlI[lIllIIlIIII[7]]);
                });
                "".length();
                if ((-"  ".length()) > 0) {
                    return ((68 ^ 14) ^ (((105 + 96) - 105) + 31)) & (((((38 + 101) - 20) + 14) ^ (((147 + 29) - 141) + 141)) ^ (-" ".length()));
                }
            } else {
                String[] strArr = new String[lIllIIlIIII[2]];
                strArr[lIllIIlIIII[1]] = lIllIIIlIlI[lIllIIlIIII[2]];
                actions = query.actions(strArr);
            }
            Item item3 = (Item) ((ItemQueryResults) actions.results()).first();
            if (!lIIlIlIlllIIIl(item3)) {
                item3.interact(lIllIIIlIlI[lIllIIlIIII[4]]);
                return lIllIIlIIII[2];
            }
            Log.info(lIllIIIlIlI[lIllIIlIIII[3]]);
            this.r.forceStop();
            return lIllIIlIIII[1];
        }
        return lIllIIlIIII[1];
    }

    private static boolean lIIlIlIlllIIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static void lIIlIlIllIlIll() {
        lIllIIlIIII = new int[11];
        lIllIIlIIII[0] = (89 ^ 79) ^ (86 ^ 94);
        lIllIIlIIII[1] = ((81 ^ 35) ^ (211 ^ 187)) & (((93 ^ 37) ^ (2 ^ 96)) ^ (-" ".length()));
        lIllIIlIIII[2] = " ".length();
        lIllIIlIIII[3] = "  ".length();
        lIllIIlIIII[4] = "   ".length();
        lIllIIlIIII[5] = (171 ^ 173) ^ (154 ^ 198);
        lIllIIlIIII[6] = 51 ^ 55;
        lIllIIlIIII[7] = (12 ^ 5) ^ (1 ^ 13);
        lIllIIlIIII[8] = 92 ^ 90;
        lIllIIlIIII[9] = (((20 + 59) - (-31)) + 31) ^ (((43 + 13) - (-3)) + 79);
        lIllIIlIIII[10] = 137 ^ 129;
    }

    @Inject
    public d(SquireAgilityPlugin squireAgilityPlugin, AgilityConfig agilityConfig) {
        this.r = squireAgilityPlugin;
        this.s = agilityConfig;
    }

    private static void lIIlIlIlIlIlII() {
        lIllIIIlIlI = new String[lIllIIlIIII[9]];
        lIllIIIlIlI[lIllIIlIIII[1]] = lIIlIlIlIIlllI("4OqyvI4cUAA=", "jthYo");
        lIllIIIlIlI[lIllIIlIIII[2]] = lIIlIlIlIIllll("JjQ2", "cUBwY");
        lIllIIIlIlI[lIllIIlIIII[3]] = lIIlIlIlIlIIII("aeyVuL/8hmYR0I/r6q2UMyI+Y97D5+k0XmSpJUYFjX2DsYHdKEZHBwIcgUbABHHShlbv64N88zg=", "ePkkd");
        lIllIIIlIlI[lIllIIlIIII[4]] = lIIlIlIlIIlllI("ZLDMG9vWltY=", "wTjoT");
        lIllIIIlIlI[lIllIIlIIII[6]] = lIIlIlIlIIlllI("NlJBG3VzEVc=", "cyFsW");
        lIllIIIlIlI[lIllIIlIIII[7]] = lIIlIlIlIlIIII("23qt7EaS8yhjkYEK3Un6Og==", "LHKrx");
        lIllIIIlIlI[lIllIIlIIII[8]] = lIIlIlIlIIlllI("13RjHAG7h4Y=", "QTbLc");
    }

    private static boolean lIIlIlIlllIIII(int i) {
        return i > 0;
    }

    private static String lIIlIlIlIIllll(String llllllllllllllllIlIlIlIIIIllIIII, String llllllllllllllllIlIlIlIIIIlIllll) {
        String str = new String(Base64.getDecoder().decode(llllllllllllllllIlIlIlIIIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llllllllllllllllIlIlIlIIIIlIlllI = new StringBuilder();
        char[] charArray = llllllllllllllllIlIlIlIIIIlIllll.toCharArray();
        int llllllllllllllllIlIlIlIIIIlIllII = lIllIIlIIII[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i = lIllIIlIIII[1];
        while (lIIlIlIllIllll(i, length)) {
            llllllllllllllllIlIlIlIIIIlIlllI.append((char) (charArray2[i] ^ charArray[llllllllllllllllIlIlIlIIIIlIllII % charArray.length]));
            "".length();
            llllllllllllllllIlIlIlIIIIlIllII++;
            i++;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllllllIlIlIlIIIIlIlllI);
    }
}
