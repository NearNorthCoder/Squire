package gg.squire.basics.construction;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.movement.Movement;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@SquireUtil
@PluginDescriptor(name = "Squire Construction Helper", description = "removes / builds", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/construction/ConstructionHelper.class */
public class ConstructionHelper extends SquirePlugin {
    private static /* synthetic */ String[] lIIlIIll;
    @Inject
    /* synthetic */ ConfigManager bA;
    private /* synthetic */ List<Integer> co = List.of(Integer.valueOf(lIIlIlII[0]), Integer.valueOf(lIIlIlII[1]), Integer.valueOf(lIIlIlII[2]), Integer.valueOf(lIIlIlII[3]));
    @Inject
    /* synthetic */ ConstructionHelperConfig cn;
    private static /* synthetic */ int[] lIIlIlII;

    protected Class<?>[] tasks() {
        return new Class[lIIlIlII[5]];
    }

    @Subscribe
    public void a(VarbitChanged varbitChanged) {
    }

    private static boolean lIIIlIllll(int i2, int i3) {
        return i2 <= i3;
    }

    protected void onStart() {
    }

    private static void lIIIlIlIll() {
        lIIlIlII = new int[14];
        lIIlIlII[0] = (-31748) & 32707;
        lIIlIlII[1] = (-16657) & 25434;
        lIIlIlII[2] = (-3201) & 11980;
        lIIlIlII[3] = (-((-1223) & 3527)) & (-5298) & 16383;
        lIIlIlII[4] = " ".length();
        lIIlIlII[5] = ((((114 + 31) - (-30)) + 1) ^ (((84 + 40) - 5) + 64)) & (((((150 + 115) - 177) + 88) ^ (((168 + 51) - 193) + 157)) ^ (-" ".length()));
        lIIlIlII[6] = "  ".length();
        lIIlIlII[7] = "   ".length();
        lIIlIlII[8] = (128 ^ 177) ^ (44 ^ 25);
        lIIlIlII[9] = (-((-16650) & 27967)) & (-16897) & 28671;
        lIIlIlII[10] = (((15 + 82) - (-8)) + 26) ^ (((79 + 31) - 34) + 58);
        lIIlIlII[11] = (88 ^ 53) ^ (207 ^ 164);
        lIIlIlII[12] = (((7 + 124) - (-11)) + 28) ^ (((75 + 52) - 90) + 136);
        lIIlIlII[13] = (77 ^ 47) ^ (39 ^ 77);
    }

    private static boolean lIIIlIlllI(int i2) {
        return i2 == 0;
    }

    private static String lIIIlIlIII(String lllIIIlIIlIlIll, String lllIIIlIIlIlIlI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(lIIlIlII[6], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(lllIIIlIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIlIIlIllII) {
            lllIIIlIIlIllII.printStackTrace();
            return null;
        }
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        if (lIIIlIllll(Inventory.getCount(item -> {
            return this.co.contains(Integer.valueOf(item.getId()));
        }), lIIlIlII[4])) {
            aT();
            return;
        }
        int[] iArr = new int[lIIlIlII[4]];
        iArr[lIIlIlII[5]] = this.cn.removeObjectID();
        TileObject nearest = TileObjects.getNearest(iArr);
        int[] iArr2 = new int[lIIlIlII[4]];
        iArr2[lIIlIlII[5]] = this.cn.buildObjectID();
        TileObject nearest2 = TileObjects.getNearest(iArr2);
        if (lIIIllIIII(nearest)) {
            if (lIIIlIllIl(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption(lIIlIlII[4]);
                "".length();
                System.out.println(lIIlIIll[lIIlIlII[4]]);
                return;
            }
            System.out.println(lIIlIIll[lIIlIlII[6]]);
            nearest.interact(lIIlIIll[lIIlIlII[7]]);
        }
        if (lIIIllIIII(nearest2)) {
            System.out.println(lIIlIIll[lIIlIlII[8]]);
            if (!lIIIllIIII(Widgets.get(lIIlIlII[9], lIIlIlII[4])) || !lIIIlIllIl(Widgets.get(lIIlIlII[9], lIIlIlII[4]).isVisible() ? 1 : 0)) {
                nearest2.interact(lIIlIIll[lIIlIlII[11]]);
                return;
            }
            System.out.println(lIIlIIll[lIIlIlII[10]]);
            Keyboard.type(this.cn.buildOption());
        }
    }

    private static void lIIIlIlIlI() {
        lIIlIIll = new String[lIIlIlII[13]];
        lIIlIIll[lIIlIlII[5]] = lIIIlIIlll("Bw01H0YnAw==", "SlYtk");
        lIIlIIll[lIIlIlII[4]] = lIIIlIlIII("RaLmzSD0qAjj1id1BP1hou13DqdVCklY", "qDrKT");
        lIIlIIll[lIIlIlII[6]] = lIIIlIlIIl("dxNcC5833uJOp0tSCl4TeQ==", "pEIGR");
        lIIlIIll[lIIlIlII[7]] = lIIIlIIlll("NjIvFTkB", "dWBzO");
        lIIlIIll[lIIlIlII[8]] = lIIIlIlIIl("ajN28C8iqekxijiSAsw3oQ==", "WFkRr");
        lIIlIIll[lIIlIlII[10]] = lIIIlIlIII("X2hJdEO1OVdCL64kzG6NxA==", "poRjH");
        lIIlIIll[lIIlIlII[11]] = lIIIlIlIIl("DOURL5fxOMI=", "VEZWA");
        lIIlIIll[lIIlIlII[12]] = lIIIlIlIII("tjNlFhrwyyw=", "xUFxa");
    }

    private static boolean lIIIlIllII(Object obj) {
        return obj == null;
    }

    private static boolean lIIIllIIII(Object obj) {
        return obj != null;
    }

    protected void onStop() {
    }

    private static boolean lIIIlIllIl(int i2) {
        return i2 != 0;
    }

    public void aT() {
        NPC nearest = NPCs.getNearest(npc -> {
            return npc.getName().toLowerCase().contains(lIIlIIll[lIIlIlII[12]]);
        });
        if (lIIIlIllII(nearest)) {
            return;
        }
        if (!lIIIlIllIl(Dialog.isOpen() ? 1 : 0)) {
            if (lIIIlIlllI(Movement.shouldWalk() ? 1 : 0)) {
                return;
            }
            nearest.interact(lIIlIIll[lIIlIlII[5]]);
        } else if (!lIIIlIllIl(Dialog.canContinue() ? 1 : 0)) {
            Dialog.chooseOption(lIIlIlII[4]);
            "".length();
        } else {
            Dialog.continueSpace();
            "".length();
            if ((((((69 + 111) - 145) + 118) ^ (((64 + 117) - 148) + 138)) & (((61 ^ 64) ^ (221 ^ 146)) ^ (-" ".length()))) > "  ".length()) {
            }
        }
    }

    private static String lIIIlIlIIl(String lllIIIlIIIllllI, String lllIIIlIIIlllIl) {
        try {
            SecretKeySpec lllIIIlIIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllIIIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), lIIlIlII[13]), "DES");
            Cipher lllIIIlIIlIIIII = Cipher.getInstance("DES");
            lllIIIlIIlIIIII.init(lIIlIlII[6], lllIIIlIIlIIIIl);
            return new String(lllIIIlIIlIIIII.doFinal(Base64.getDecoder().decode(lllIIIlIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception lllIIIlIIIlllll) {
            lllIIIlIIIlllll.printStackTrace();
            return null;
        }
    }

    @Provides
    ConstructionHelperConfig g(ConfigManager configManager) {
        return (ConstructionHelperConfig) configManager.getConfig(ConstructionHelperConfig.class);
    }

    private static String lIIIlIIlll(String lllIIIlIlIIIIII, String lllIIIlIIllllll) {
        String lllIIIlIlIIIIII2 = new String(Base64.getDecoder().decode(lllIIIlIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] lllIIIlIIllllIl = lllIIIlIIllllll.toCharArray();
        int lllIIIlIIllIlll = lIIlIlII[5];
        char[] charArray = lllIIIlIlIIIIII2.toCharArray();
        int lllIIIlIIllIlIl = charArray.length;
        int i2 = lIIlIlII[5];
        while (lIIIllIIIl(i2, lllIIIlIIllIlIl)) {
            char lllIIIlIlIIIIIl = charArray[i2];
            sb.append((char) (lllIIIlIlIIIIIl ^ lllIIIlIIllllIl[lllIIIlIIllIlll % lllIIIlIIllllIl.length]));
            "".length();
            lllIIIlIIllIlll++;
            i2++;
            "".length();
            if (0 != 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    static {
        lIIIlIlIll();
        lIIIlIlIlI();
    }

    private static boolean lIIIllIIIl(int i2, int i3) {
        return i2 < i3;
    }
}
