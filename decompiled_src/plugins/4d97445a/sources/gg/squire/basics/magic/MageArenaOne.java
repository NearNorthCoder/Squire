package gg.squire.basics.magic;

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
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.entities.Players;
import net.unethicalite.api.magic.Magic;
import net.unethicalite.client.managers.interaction.InteractionManager;
@SquireUtil
@PluginDescriptor(name = "Squire Mage Arena One", description = "Cast god spells for you", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/magic/MageArenaOne.class */
public class MageArenaOne extends SquirePlugin {
    @Inject
    /* synthetic */ MageArenaOneConfig eM;
    private static /* synthetic */ String[] llIlllII;
    private static /* synthetic */ int[] llIlllIl;
    @Inject
    /* synthetic */ ConfigManager bA;

    private static String llIIIIlIII(String llIlIlIIllIlIIl, String llIlIlIIllIlIII) {
        String llIlIlIIllIlIIl2 = new String(Base64.getDecoder().decode(llIlIlIIllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIlIlIIllIIlll = new StringBuilder();
        char[] charArray = llIlIlIIllIlIII.toCharArray();
        int llIlIlIIllIIlIl = llIlllIl[1];
        char[] charArray2 = llIlIlIIllIlIIl2.toCharArray();
        int length = charArray2.length;
        int i2 = llIlllIl[1];
        while (llIIIlIIIl(i2, length)) {
            char llIlIlIIllIlIlI = charArray2[i2];
            llIlIlIIllIIlll.append((char) (llIlIlIIllIlIlI ^ charArray[llIlIlIIllIIlIl % charArray.length]));
            "".length();
            llIlIlIIllIIlIl++;
            i2++;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llIlIlIIllIIlll);
    }

    private static void llIIIIllII() {
        llIlllIl = new int[5];
        llIlllIl[0] = -" ".length();
        llIlllIl[1] = (194 ^ 133) & ((71 ^ 0) ^ (-1));
        llIlllIl[2] = " ".length();
        llIlllIl[3] = "  ".length();
        llIlllIl[4] = (85 ^ 73) ^ (61 ^ 41);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    protected void onStop() {
        InteractionManager.setHelper((boolean) llIlllIl[1]);
    }

    private static boolean llIIIlIIII(int i2) {
        return i2 != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    protected void onStart() {
        InteractionManager.setHelper((boolean) llIlllIl[2]);
    }

    private static String llIIIIlIIl(String llIlIlIIllllIIl, String llIlIlIIllllIII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIlIlIIllllIII.getBytes(StandardCharsets.UTF_8)), llIlllIl[4]), "DES");
            Cipher llIlIlIIllllIll = Cipher.getInstance("DES");
            llIlIlIIllllIll.init(llIlllIl[3], secretKeySpec);
            return new String(llIlIlIIllllIll.doFinal(Base64.getDecoder().decode(llIlIlIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIlIlIIllllIlI) {
            llIlIlIIllllIlI.printStackTrace();
            return null;
        }
    }

    private static void llIIIIlIll() {
        llIlllII = new String[llIlllIl[3]];
        llIlllII[llIlllIl[1]] = llIIIIlIII("LC0aAyUG", "mYnbF");
        llIlllII[llIlllIl[2]] = llIIIIlIIl("cQN1osyTy/Y=", "fqINY");
    }

    private static boolean llIIIlIIIl(int i2, int i3) {
        return i2 < i3;
    }

    private static boolean llIIIIllIl(Object obj) {
        return obj != null;
    }

    private static boolean llIIIIllll(Object obj, Object obj2) {
        return obj == obj2;
    }

    static {
        llIIIIllII();
        llIIIIlIll();
    }

    private static boolean llIIIIlllI(int i2, int i3) {
        return i2 == i3;
    }

    @Provides
    MageArenaOneConfig o(ConfigManager configManager) {
        return (MageArenaOneConfig) configManager.getConfig(MageArenaOneConfig.class);
    }

    protected Class<?>[] tasks() {
        return new Class[llIlllIl[1]];
    }

    @Subscribe
    public void onGameTick(GameTick gameTick) {
        List all = NPCs.getAll(npc -> {
            if (llIIIIllll(npc.getInteracting(), Players.getLocal())) {
                String[] strArr = new String[llIlllIl[2]];
                strArr[llIlllIl[1]] = llIlllII[llIlllIl[1]];
                if (llIIIlIIII(npc.hasAction(strArr) ? 1 : 0) && llIIIlIIII(npc.getName().contains(llIlllII[llIlllIl[2]]) ? 1 : 0)) {
                    ?? r0 = llIlllIl[2];
                    "".length();
                    return ((77 ^ 44) & ((16 ^ 113) ^ (-1))) >= " ".length() ? true & ((true ^ true) ^ true) : r0;
                }
            }
            return llIlllIl[1];
        });
        if (llIIIIllIl(all) && llIIIIlllI(Players.getLocal().getAnimation(), llIlllIl[0])) {
            Magic.cast(this.eM.spell(), (NPC) all.get(llIlllIl[1]));
        }
    }
}
