package gg.squire.basics.inventory;

import com.google.inject.Inject;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import net.runelite.api.Item;
import net.runelite.api.events.GameTick;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.managers.interaction.InteractionManager;
@SquireUtil
@PluginDescriptor(name = "Squire Inventory Assistant", description = "Assist with inventory", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/inventory/InventoryAssistant.class */
public class InventoryAssistant extends SquirePlugin {
    @Inject
    /* synthetic */ InventoryAsisstantConfig dK;
    private static /* synthetic */ String[] lllIIlIlI;
    /* synthetic */ boolean dL;
    private static /* synthetic */ int[] lllIIlIll;
    private final /* synthetic */ Set<Item> dJ = new HashSet();

    @Provides
    InventoryAsisstantConfig k(ConfigManager configManager) {
        return (InventoryAsisstantConfig) configManager.getConfig(InventoryAsisstantConfig.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v21, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Subscribe
    public void onGameTick(GameTick gameTick) {
        int i2;
        if (!llIIIlIIIll(Inventory.isFull() ? 1 : 0) || llIIIlIIlII(Inventory.getCount(bO()), this.dK.amountToDrop())) {
            i2 = lllIIlIll[1];
            "".length();
            if ((-(98 ^ 102)) > 0) {
                return;
            }
        } else {
            i2 = lllIIlIll[0];
        }
        int i3 = i2;
        if (llIIIlIIIll(this.dL ? 1 : 0) && llIIIlIIlIl(i3)) {
            this.dJ.clear();
            this.dL = lllIIlIll[1];
            "".length();
            if ((-(126 ^ 123)) >= 0) {
                return;
            }
        } else if (llIIIlIIlIl(this.dL ? 1 : 0) && llIIIlIIIll(Inventory.contains(bO()) ? 1 : 0)) {
            this.dL = lllIIlIll[0];
        }
        if (llIIIlIIIll(this.dL ? 1 : 0)) {
            return;
        }
        int i4 = lllIIlIll[2];
        for (Item item : Inventory.getAll(bO())) {
            if (llIIIlIIlIl(this.dJ.contains(item) ? 1 : 0)) {
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            } else {
                item.interact(lllIIlIlI[lllIIlIll[1]]);
                this.dJ.add(item);
                "".length();
                int i5 = i4;
                i4--;
                if (llIIIlIIIll(i5)) {
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                    return;
                }
                "".length();
                if ("  ".length() >= ((((10 + 80) - 57) + 126) ^ (((113 + 75) - 54) + 21))) {
                    return;
                }
            }
        }
    }

    private static boolean llIIIlIIIlI(int i2, int i3) {
        return i2 < i3;
    }

    private static void llIIIlIIIIl() {
        lllIIlIll = new int[4];
        lllIIlIll[0] = (231 ^ 168) & ((26 ^ 85) ^ (-1));
        lllIIlIll[1] = " ".length();
        lllIIlIll[2] = 87 ^ 95;
        lllIIlIll[3] = "  ".length();
    }

    private static void llIIIlIIIII() {
        lllIIlIlI = new String[lllIIlIll[3]];
        lllIIlIlI[lllIIlIll[0]] = llIIIIlllll("Zg==", "JmjLz");
        lllIIlIlI[lllIIlIll[1]] = llIIIIlllll("NjkBNw==", "rKnGy");
    }

    protected Class<?>[] tasks() {
        return new Class[lllIIlIll[0]];
    }

    static {
        llIIIlIIIIl();
        llIIIlIIIII();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    protected void onStop() {
        InteractionManager.setHelper((boolean) lllIIlIll[0]);
    }

    private static boolean llIIIlIIIll(int i2) {
        return i2 == 0;
    }

    public void c(boolean z) {
        this.dL = z;
    }

    private static String llIIIIlllll(String lIlIlIlllllllll, String lIlIlIllllllllI) {
        String str = new String(Base64.getDecoder().decode(lIlIlIlllllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder();
        char[] charArray = lIlIlIllllllllI.toCharArray();
        int lIlIlIlllllIllI = lllIIlIll[0];
        char[] charArray2 = str.toCharArray();
        int length = charArray2.length;
        int i2 = lllIIlIll[0];
        while (llIIIlIIIlI(i2, length)) {
            char lIlIllIIIIIIIII = charArray2[i2];
            sb.append((char) (lIlIllIIIIIIIII ^ charArray[lIlIlIlllllIllI % charArray.length]));
            "".length();
            lIlIlIlllllIllI++;
            i2++;
            "".length();
            if ((-" ".length()) > 0) {
                return null;
            }
        }
        return String.valueOf(sb);
    }

    public int[] bO() {
        String[] split = this.dK.itemsToDrop().split(lllIIlIlI[lllIIlIll[0]]);
        int[] iArr = new int[split.length];
        int i2 = lllIIlIll[0];
        while (llIIIlIIIlI(i2, split.length)) {
            iArr[i2] = Integer.parseInt(split[i2].trim());
            i2++;
            "".length();
            if ("   ".length() < ((162 ^ 131) & ((67 ^ 98) ^ (-1)))) {
                return null;
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    protected void onStart() {
        InteractionManager.setHelper((boolean) lllIIlIll[1]);
        this.dL = lllIIlIll[0];
    }

    private static boolean llIIIlIIlII(int i2, int i3) {
        return i2 >= i3;
    }

    private static boolean llIIIlIIlIl(int i2) {
        return i2 != 0;
    }

    public boolean bP() {
        return this.dL;
    }
}
