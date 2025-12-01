package gg.squire.basics.construction;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.runelite.api.TileObject;
import net.runelite.api.events.GameTick;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.TileObjects;
import net.unethicalite.api.input.Keyboard;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.api.widgets.Dialog;
import net.unethicalite.api.widgets.Widgets;
@SquireUtil
@PluginDescriptor(name = "Squire Mahogany Tables", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/construction/MahoganyTables.class */
public class MahoganyTables extends SquirePlugin {
    private static /* synthetic */ String[] llIlIlIl;
    private static /* synthetic */ int[] llIlIllI;

    protected Class<?>[] tasks() {
        return new Class[llIlIllI[1]];
    }

    private static void lIllllllII() {
        llIlIllI = new int[14];
        llIlIllI[0] = " ".length();
        llIlIllI[1] = (89 ^ 26) & ((240 ^ 179) ^ (-1));
        llIlIllI[2] = ((106 + 108) - 32) + 47;
        llIlIllI[3] = (-18465) & 27246;
        llIlIllI[4] = (((138 + 43) - 27) + 28) ^ (((82 + 128) - 75) + 43);
        llIlIllI[5] = "  ".length();
        llIlIllI[6] = "   ".length();
        llIlIllI[7] = (214 ^ 189) ^ (205 ^ 180);
        llIlIllI[8] = (-((-8803) & 31347)) & (-514) & 23515;
        llIlIllI[9] = 144 ^ 150;
        llIlIllI[10] = (-1026) & 16323;
        llIlIllI[11] = (-((-5431) & 23871)) & (-6) & 31743;
        llIlIllI[12] = 19 ^ 22;
        llIlIllI[13] = (((146 + 127) - 162) + 73) ^ (((123 + 6) - 32) + 79);
    }

    static {
        lIllllllII();
        lIlllllIll();
    }

    private static String lIlllllIIl(String llIlIlIllllIlll, String llIlIlIllllIllI) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIlIlIllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIlIlIlllllIIl = Cipher.getInstance("Blowfish");
            llIlIlIlllllIIl.init(llIlIllI[5], secretKeySpec);
            return new String(llIlIlIlllllIIl.doFinal(Base64.getDecoder().decode(llIlIlIllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIlIlllllIII) {
            llIlIlIlllllIII.printStackTrace();
            return null;
        }
    }

    private static String lIlllllIlI(String llIlIlIllIllIlI, String llIlIlIllIllIIl) {
        String str = new String(Base64.getDecoder().decode(llIlIlIllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = llIlIlIllIllIIl.toCharArray();
        int llIlIlIllIlIllI = llIlIllI[1];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = llIlIllI[1];
        while (llIIIIIIll(i2, length)) {
            char llIlIlIllIllIll = charArray2[i2];
            sb.append((char) (llIlIlIllIllIll ^ charArray[llIlIlIllIlIllI % charArray.length]));
            "".length();
            llIlIlIllIlIllI++;
            i2++;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    protected void onStart() {
    }

    private static boolean lIllllllIl(int i2) {
        return i2 == 0;
    }

    private static void lIlllllIll() {
        llIlIlIl = new String[llIlIllI[12]];
        llIlIlIl[llIlIllI[1]] = lIllllIllI("rmEhcmHLKCU=", "Zihtw");
        llIlIlIl[llIlIllI[0]] = lIllllIllI("GecUEWYw7qA=", "ITehw");
        llIlIlIl[llIlIllI[5]] = lIlllllIIl("CYENCB4lHaQ=", "frnTK");
        llIlIlIl[llIlIllI[6]] = lIllllIllI("SfWyTM5RodU=", "KQROk");
        llIlIlIl[llIlIllI[4]] = lIlllllIlI("NhUhBjkB", "dpLiO");
    }

    private static boolean llIIIIIIIl(Object obj) {
        return obj != null;
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int[] iArr = new int[llIlIllI[0]];
        iArr[llIlIllI[1]] = llIlIllI[2];
        NPC nearest = NPCs.getNearest(iArr);
        int[] iArr2 = new int[llIlIllI[0]];
        iArr2[llIlIllI[1]] = llIlIllI[3];
        int count = Inventory.getCount(iArr2);
        if (lIllllllIl(count)) {
            if (lIlllllllI(nearest)) {
                return;
            }
            if (!lIllllllll(Dialog.canContinue() ? 1 : 0)) {
                nearest.interact(llIlIlIl[llIlIllI[1]]);
                return;
            }
            DialogOption[] dialogOptionArr = new DialogOption[llIlIllI[4]];
            dialogOptionArr[llIlIllI[1]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[llIlIllI[0]] = DialogOption.CHAT_OPTION_ONE;
            dialogOptionArr[llIlIllI[5]] = DialogOption.NPC_CONTINUE;
            dialogOptionArr[llIlIllI[6]] = DialogOption.NPC_CONTINUE;
            Dialog.invokeDialog(dialogOptionArr);
            return;
        }
        if (llIIIIIIII(count, llIlIllI[7])) {
            if (lIllllllll(Dialog.isViewingOptions() ? 1 : 0)) {
                Dialog.chooseOption(llIlIllI[0]);
                "".length();
                return;
            } else if (llIIIIIIIl(nearest)) {
                nearest.interact(llIlIlIl[llIlIllI[0]]);
                return;
            }
        }
        if (lIllllllll(Widgets.isVisible(Widgets.get(llIlIllI[8], llIlIllI[5])) ? 1 : 0)) {
            Keyboard.type(llIlIllI[9]);
            return;
        }
        int[] iArr3 = new int[llIlIllI[0]];
        iArr3[llIlIllI[1]] = llIlIllI[10];
        TileObject nearest2 = TileObjects.getNearest(iArr3);
        if (llIIIIIIIl(nearest2)) {
            nearest2.interact(llIlIlIl[llIlIllI[5]]);
            Keyboard.type(llIlIllI[9]);
            return;
        }
        int[] iArr4 = new int[llIlIllI[0]];
        iArr4[llIlIllI[1]] = llIlIllI[11];
        TileObject nearest3 = TileObjects.getNearest(iArr4);
        if (llIIIIIIIl(nearest3)) {
            if (!lIllllllll(Dialog.isViewingOptions() ? 1 : 0)) {
                nearest3.interact(llIlIlIl[llIlIllI[4]]);
                return;
            }
            String[] strArr = new String[llIlIllI[0]];
            strArr[llIlIllI[1]] = llIlIlIl[llIlIllI[6]];
            Dialog.chooseOption(strArr);
            "".length();
        }
    }

    private static boolean lIlllllllI(Object obj) {
        return obj == null;
    }

    private static boolean lIllllllll(int i2) {
        return i2 != 0;
    }

    private static boolean llIIIIIIII(int i2, int i3) {
        return i2 == i3;
    }

    private static boolean llIIIIIIll(int i2, int i3) {
        return i2 < i3;
    }

    protected void onStop() {
    }

    private static String lIllllIllI(String llIlIlIlllIlIlI, String llIlIlIlllIlIIl) {
        try {
            SecretKeySpec llIlIlIlllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIlIlllIlIIl.getBytes(StandardCharsets.UTF_8)), llIlIllI[13]), "DES");
            Cipher llIlIlIlllIllII = Cipher.getInstance("DES");
            llIlIlIlllIllII.init(llIlIllI[5], llIlIlIlllIllIl);
            return new String(llIlIlIlllIllII.doFinal(Base64.getDecoder().decode(llIlIlIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIlIlllIlIll) {
            llIlIlIlllIlIll.printStackTrace();
            return null;
        }
    }
}
