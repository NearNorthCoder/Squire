/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.fw.TaskDesc
 *  javax.inject.Inject
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.TileObject
 *  net.runelite.api.events.AnimationChanged
 *  net.runelite.api.widgets.Widget
 *  net.runelite.client.eventbus.Subscribe
 *  net.unethicalite.api.entities.Players
 *  net.unethicalite.api.entities.TileObjects
 *  net.unethicalite.api.game.House
 *  net.unethicalite.api.input.Keyboard
 *  net.unethicalite.api.widgets.Widgets
 *  net.unethicalite.client.Static
 */
package i.v.k.o.-.u.s.e.r.a.q.r.t.h;

import gg.squire.client.plugins.fw.TaskDesc;
import gg.squire.vorkath.SquireVorkathConfig;
import gg.squire.vorkath.SquireVorkathPlugin;
import i.v.k.o.-.u.s.e.r.a.q.r.t.h.o;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.TileObject;
import net.runelite.api.events.AnimationChanged;
import net.runelite.api.widgets.Widget;
import net.runelite.client.eventbus.Subscribe;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.game.House;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.widgets.Widgets;
import net.unethicalite.client.Static;

@TaskDesc(name="Handling house", priority=84, register=true, blocking=true)
public class r
extends o {
    private static /* synthetic */ String[] lIlIlIllIlIII;
    private /* synthetic */ int bX;
    private static /* synthetic */ int[] lIlIlIllIlIIl;
    private /* synthetic */ boolean bW;

    private static boolean lIlllllllIlIlll(Object object, Object object2) {
        return object == object2;
    }

    static {
        r.lIlllllllIlIlII();
        r.lIlllllllIlIIll();
    }

    @Subscribe
    public void a(AnimationChanged animationChanged) {
        if (r.lIlllllllIllIlI(animationChanged.getActor().getAnimation(), lIlIlIllIlIIl[4])) {
            this.bW = lIlIlIllIlIIl[3];
        }
    }

    private static boolean lIlllllllIlIllI(int n2) {
        return n2 != 0;
    }

    private static void lIlllllllIlIIll() {
        lIlIlIllIlIII = new String[lIlIlIllIlIIl[5]];
        r.lIlIlIllIlIII[r.lIlIlIllIlIIl[0]] = r.lIlllllllIlIIIl("nMCYAix0Sw6N3hgnb/K7dQ==", "tjZRl");
        r.lIlIlIllIlIII[r.lIlIlIllIlIIl[3]] = r.lIlllllllIlIIlI("9vlopzA4QsgoEPCZl3EB4g==", "fTMek");
    }

    @Override
    public boolean run() {
        r llllllllllllllIllIlIlIIIlllIllII;
        if (!r.lIlllllllIlIlIl(this.S() ? 1 : 0) || r.lIlllllllIlIlIl(this.T().needsToBank() ? 1 : 0)) {
            return lIlIlIllIlIIl[0];
        }
        if (r.lIlllllllIlIllI(llllllllllllllIllIlIlIIIlllIllII.R() ? 1 : 0)) {
            return lIlIlIllIlIIl[0];
        }
        if (r.lIlllllllIlIlIl(House.isInside() ? 1 : 0)) {
            return lIlIlIllIlIIl[0];
        }
        if (!r.lIlllllllIlIllI(Players.getLocal().isIdle() ? 1 : 0) || r.lIlllllllIlIlll(Static.getClient().getGameState(), GameState.LOADING)) {
            return lIlIlIllIlIIl[0];
        }
        if (r.lIlllllllIlIllI(House.isPoolDrinkUseful() ? 1 : 0)) {
            return House.drinkFromPool();
        }
        if (r.lIlllllllIllIII(House.getJewelryBox())) {
            return lIlIlIllIlIIl[0];
        }
        if (r.lIlllllllIlIllI(Widgets.isVisible((Widget)Widgets.get((int)lIlIlIllIlIIl[1], (int)lIlIlIllIlIIl[0])) ? 1 : 0)) {
            Keyboard.type((char)lIlIlIllIlIIl[2]);
            return lIlIlIllIlIIl[3];
        }
        TileObject llllllllllllllIllIlIlIIIlllIlIll = TileObjects.getNearest(tileObject -> {
            int n2;
            if (r.lIlllllllIllIIl(tileObject.getName()) && r.lIlllllllIlIllI(tileObject.getName().contains(lIlIlIllIlIII[lIlIlIllIlIIl[3]]) ? 1 : 0)) {
                n2 = lIlIlIllIlIIl[3];
                "".length();
                if (-"   ".length() >= 0) {
                    return ((116 + 35 - 134 + 117 ^ 103 + 19 - 109 + 123) & (0x3D ^ 0x64 ^ (0xE2 ^ 0xB5) ^ -" ".length())) != 0;
                }
            } else {
                n2 = lIlIlIllIlIIl[0];
            }
            return n2 != 0;
        });
        if (r.lIlllllllIllIIl(llllllllllllllIllIlIlIIIlllIlIll)) {
            llllllllllllllIllIlIlIIIlllIlIll.interact(lIlIlIllIlIII[lIlIlIllIlIIl[0]]);
            return lIlIlIllIlIIl[3];
        }
        return lIlIlIllIlIIl[0];
    }

    private static boolean lIlllllllIllIIl(Object object) {
        return object != null;
    }

    private static boolean lIlllllllIllIlI(int n2, int n3) {
        return n2 == n3;
    }

    private static String lIlllllllIlIIlI(String llllllllllllllIllIlIlIIIllIllIll, String llllllllllllllIllIlIlIIIllIlllII) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIIIlllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIIllIlllII.getBytes(StandardCharsets.UTF_8)), lIlIlIllIlIIl[6]), "DES");
            Cipher llllllllllllllIllIlIlIIIllIlllll = Cipher.getInstance("DES");
            llllllllllllllIllIlIlIIIllIlllll.init(lIlIlIllIlIIl[5], llllllllllllllIllIlIlIIIlllIIIII);
            return new String(llllllllllllllIllIlIlIIIllIlllll.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIIIllIllllI) {
            llllllllllllllIllIlIlIIIllIllllI.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean Q() {
        return lIlIlIllIlIIl[0];
    }

    private static String lIlllllllIlIIIl(String llllllllllllllIllIlIlIIIllIlIIII, String llllllllllllllIllIlIlIIIllIIllIl) {
        try {
            SecretKeySpec llllllllllllllIllIlIlIIIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllllIllIlIlIIIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llllllllllllllIllIlIlIIIllIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllllIllIlIlIIIllIlIIlI.init(lIlIlIllIlIIl[5], llllllllllllllIllIlIlIIIllIlIIll);
            return new String(llllllllllllllIllIlIlIIIllIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllllIllIlIlIIIllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllllIllIlIlIIIllIlIIIl) {
            llllllllllllllIllIlIlIIIllIlIIIl.printStackTrace();
            return null;
        }
    }

    @Inject
    protected r(SquireVorkathPlugin squireVorkathPlugin, SquireVorkathConfig squireVorkathConfig, Client client) {
        super(squireVorkathPlugin, squireVorkathConfig, client);
    }

    private static void lIlllllllIlIlII() {
        lIlIlIllIlIIl = new int[7];
        r.lIlIlIllIlIIl[0] = (0x28 ^ 0x4B) & ~(0x60 ^ 3);
        r.lIlIlIllIlIIl[1] = -(0xFFFFFDE6 & 0x569B) & (0xFFFFDECF & 0x77FF);
        r.lIlIlIllIlIIl[2] = 0xAC ^ 0x9F;
        r.lIlIlIllIlIIl[3] = " ".length();
        r.lIlIlIllIlIIl[4] = -(0xFFFFF1F7 & 0x6F1F) & (0xFFFFFF9F & 0x7DFF);
        r.lIlIlIllIlIIl[5] = "  ".length();
        r.lIlIlIllIlIIl[6] = 0x55 ^ 0x5D;
    }

    private static boolean lIlllllllIllIII(Object object) {
        return object == null;
    }

    private static boolean lIlllllllIlIlIl(int n2) {
        return n2 == 0;
    }
}

