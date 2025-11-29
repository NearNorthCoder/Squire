package gg.squire.leagues.blastfurnace;

import gg.squire.client.plugins.SquirePlugin;
import i.e.u.e.s.r.a.l.q.p000.p0010.s.p0022.p0032.u.e.p004.g.p0055.a;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.Item;
import net.runelite.api.TileObject;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.Vars;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Production;
@PluginDescriptor(name = "[Leagues] Gold BF", enabledByDefault = false)
/* loaded from: 21e931a2-dcd2-41bf-996b-cb50a8d5161d.jar:gg/squire/leagues/blastfurnace/BlastFurnace.class */
public class BlastFurnace extends SquirePlugin {
    private static /* synthetic */ int[] lIIII;
    private static /* synthetic */ String[] llll;
    /* synthetic */ boolean d;

    private static boolean lIllIl(int i2, int i3) {
        return i2 > i3;
    }

    protected void onStop() {
    }

    protected Class<?>[] tasks() {
        return new Class[lIIII[0]];
    }

    private static boolean lIllll(int i2) {
        return i2 == 0;
    }

    private static boolean llIIIl(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    protected void onStart() {
        this.d = lIIII[0];
    }

    private static String lIlIII(String llllllIlIllIIlI, String llllllIlIllIIIl) {
        String llllllIlIllIIlI2 = new String(Base64.getDecoder().decode(llllllIlIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] llllllIlIlIllll = llllllIlIllIIIl.toCharArray();
        int llllllIlIlIlllI = lIIII[0];
        char[] charArray = llllllIlIllIIlI2.toCharArray();
        int length = charArray.length;
        int i2 = lIIII[0];
        while (lIlllI(i2, length)) {
            char llllllIlIllIIll = charArray[i2];
            sb.append((char) (llllllIlIllIIll ^ llllllIlIlIllll[llllllIlIlIlllI % llllllIlIlIllll.length]));
            "".length();
            llllllIlIlIlllI++;
            i2++;
            "".length();
            if ((-" ".length()) > ((101 ^ 98) & ((0 ^ 7) ^ (-1)))) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    private static boolean llIlII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean llIIlI(Object obj) {
        return obj == null;
    }

    private static boolean llIIll(int i2) {
        return i2 > 0;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int[] iArr = new int[lIIII[1]];
        iArr[lIIII[0]] = a.a;
        Item first = Inventory.getFirst(iArr);
        Item first2 = Inventory.getFirst(item -> {
            if (llIlII(item.getId(), lIIII[5]) && lIllll(item.isNoted() ? 1 : 0)) {
                ?? r0 = lIIII[1];
                "".length();
                return (-" ".length()) > "   ".length() ? ((2 ^ 90) ^ (67 ^ 36)) & (((176 ^ 158) ^ (61 ^ 44)) ^ (-" ".length())) : r0;
            }
            return lIIII[0];
        });
        Item first3 = Inventory.getFirst(item2 -> {
            if (lIllII(item2.getName().contains(llll[lIIII[9]]) ? 1 : 0) && lIllII(item2.isNoted() ? 1 : 0)) {
                ?? r0 = lIIII[1];
                "".length();
                return (true ^ true) & ((true ^ true) ^ true) ? (true ^ true) & ((true ^ true) ^ true) : r0;
            }
            return lIIII[0];
        });
        Item first4 = Inventory.getFirst(item3 -> {
            if (llIlII(item3.getId(), lIIII[8]) && lIllll(item3.isNoted() ? 1 : 0)) {
                ?? r0 = lIIII[1];
                "".length();
                return (-" ".length()) > "  ".length() ? (true ^ true) & ((!true) ^ true) : r0;
            }
            return lIIII[0];
        });
        TileObject nearest = TileObjects.getNearest(tileObject -> {
            if (lIllII(tileObject.getName().contains(llll[lIIII[6]]) ? 1 : 0)) {
                String[] strArr = new String[lIIII[1]];
                strArr[lIIII[0]] = llll[lIIII[7]];
                if (lIllII(tileObject.hasAction(strArr) ? 1 : 0)) {
                    ?? r0 = lIIII[1];
                    "".length();
                    return (-"   ".length()) >= 0 ? ((82 ^ 114) ^ (183 ^ 144)) & (((115 ^ 104) ^ (51 ^ 47)) ^ (-" ".length())) : r0;
                }
            }
            return lIIII[0];
        });
        String[] strArr = new String[lIIII[1]];
        strArr[lIIII[0]] = llll[lIIII[0]];
        TileObject nearest2 = TileObjects.getNearest(strArr);
        if (lIlIll(first4) && lIlIll(first)) {
            first4.useOn(first);
        } else if (lIllII(Production.isOpen() ? 1 : 0)) {
            Production.choosePreviousOption();
        } else if (lIllII(this.d ? 1 : 0) && lIllIl(Players.getLocal().getWorldLocation().distanceTo(nearest2.getWorldLocation()), lIIII[2])) {
            Movement.walkTo(nearest2.getWorldLocation());
            "".length();
        } else {
            if (lIlllI(Vars.getBit(lIIII[3]), lIIII[1]) && lIlllI(Vars.getBit(lIIII[4]), lIIII[1])) {
                if (lIlIll(first3) && lIlIll(first) && lIllll(this.d ? 1 : 0) && llIIIl(Players.getLocal().getWorldLocation().distanceTo(nearest2.getWorldLocation()), lIIII[2]) && llIIlI(first4)) {
                    int[] iArr2 = new int[lIIII[1]];
                    iArr2[lIIII[0]] = lIIII[5];
                    if (lIllll(Inventory.contains(iArr2) ? 1 : 0)) {
                        first3.useOn(first);
                        return;
                    }
                }
                if (lIlIll(first2)) {
                    int[] iArr3 = new int[lIIII[1]];
                    iArr3[lIIII[0]] = first2.getId();
                    if (lIllII(Inventory.contains(iArr3) ? 1 : 0)) {
                        nearest.interact(lIIII[0]);
                        return;
                    }
                }
            }
            if (llIIll(Vars.getBit(lIIII[3])) && lIllll(Production.isOpen() ? 1 : 0)) {
                nearest2.interact(lIIII[0]);
            }
        }
    }

    private static boolean lIlllI(int i2, int i3) {
        return i2 < i3;
    }

    static {
        lIlIlI();
        lIlIIl();
    }

    private static void lIlIIl() {
        llll = new String[lIIII[10]];
        llll[lIIII[0]] = lIIlll("ugB0bmPV8hJuNY1xg0LvAw==", "woyzw");
        llll[lIIII[1]] = lIIlll("RcxwksnQirdQDIY1JbLjpXzAqpBJVs1xL8TF43peRtcyFTjud32I1zQLgVzjCZ5k", "KBuZm");
        llll[lIIII[2]] = lIlIII("DC0NA1IJIxMUUg0wDgpSHyoERxYCMRECHBgnEw==", "kBagr");
        llll[lIIII[6]] = lIlIII("KQgqIg8TCDZ0CA8LMA==", "jgDTj");
        llll[lIIII[7]] = lIIlll("PqEKLY8V8hrZGudCSqd6nQ==", "RRGtK");
        llll[lIIII[9]] = lIIlll("afzB6i7rz6zhoeALM/jiJA==", "jKdxq");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        String message = chatMessage.getMessage();
        if (lIllII(message.contains(llll[lIIII[1]]) ? 1 : 0)) {
            this.d = lIIII[1];
        }
        if (lIllII(message.contains(llll[lIIII[2]]) ? 1 : 0)) {
            this.d = lIIII[0];
        }
    }

    private static void lIlIlI() {
        lIIII = new int[11];
        lIIII[0] = (216 ^ 144) & ((107 ^ 35) ^ (-1));
        lIIII[1] = " ".length();
        lIIII[2] = "  ".length();
        lIIII[3] = (-((-24963) & 32203)) & (-16389) & 24575;
        lIIII[4] = (-((-1549) & 24077)) & (-65) & 23547;
        lIIII[5] = (-3137) & 3580;
        lIIII[6] = "   ".length();
        lIIII[7] = (48 ^ 70) ^ (76 ^ 62);
        lIIII[8] = (-((-8723) & 26323)) & (-4105) & 24061;
        lIIII[9] = 101 ^ 96;
        lIIII[10] = (((100 + 15) - 68) + 99) ^ (((105 + 67) - 101) + 77);
    }

    private static String lIIlll(String llllllIllIIIIlI, String llllllIllIIIIIl) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllIllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIII[2], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llllllIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llllllIllIIIIll) {
            llllllIllIIIIll.printStackTrace();
            return null;
        }
    }

    private static boolean lIlIll(Object obj) {
        return obj != null;
    }

    private static boolean lIllII(int i2) {
        return i2 != 0;
    }
}
