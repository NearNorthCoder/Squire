package gg.squire.basics.combat.Cannon;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.K;
import i.i.b.s.c.q.r.s.s.p000.u.a.e.L;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameObject;
import net.runelite.api.MenuAction;
import net.runelite.api.Player;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameObjectSpawned;
import net.runelite.api.events.MenuOptionClicked;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
@SquireUtil
@PluginDescriptor(name = "Squire Cannon Reloader", description = "Reloads cannon when it runs out of ammo", enabledByDefault = false)
/* loaded from: 4d97445a-f331-4d37-a32a-a78260ee3d07.jar:gg/squire/basics/combat/Cannon/CannonReloader.class */
public class CannonReloader extends SquirePlugin {
    private /* synthetic */ boolean bK;
    private /* synthetic */ GameObject bN;
    private /* synthetic */ WorldPoint bH;
    @Inject
    private /* synthetic */ Client v;
    private static /* synthetic */ int[] lIIlIllII;
    private static /* synthetic */ String[] lIIlIIIll;
    private /* synthetic */ boolean bG;
    private /* synthetic */ int bJ;
    private /* synthetic */ WorldArea bL;
    @Inject
    private /* synthetic */ ClientThread bB;
    private /* synthetic */ boolean bI;
    private /* synthetic */ int bM = lIIlIllII[0];
    private /* synthetic */ List<WorldPoint> bO = new ArrayList();

    private static boolean lIIIIIlllll(int i2, int i3) {
        return i2 < i3;
    }

    private static void lIIIIIlIlII() {
        lIIlIllII = new int[14];
        lIIlIllII[0] = -" ".length();
        lIIlIllII[1] = " ".length();
        lIIlIllII[2] = "   ".length();
        lIIlIllII[3] = "  ".length();
        lIIlIllII[4] = ((((84 + 23) - 17) + 45) ^ (((101 + 79) - 130) + 116)) & (((75 ^ 116) ^ (54 ^ 40)) ^ (-" ".length()));
        lIIlIllII[5] = 93 ^ 90;
        lIIlIllII[6] = (-4833) & 47861;
        lIIlIllII[7] = (-20485) & 21311;
        lIIlIllII[8] = (228 ^ 158) ^ (57 ^ 69);
        lIIlIllII[9] = (-((-24579) & 25959)) & (-20993) & 65399;
        lIIlIllII[10] = (-10522) & 32249;
        lIIlIllII[11] = (59 ^ 51) ^ (80 ^ 92);
        lIIlIllII[12] = 110 ^ 107;
        lIIlIllII[13] = (((117 + 66) - 31) + 10) ^ (((119 + 123) - 189) + 117);
    }

    public GameObject aD() {
        return this.bN;
    }

    static {
        lIIIIIlIlII();
        lIIIIIlIIll();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v51, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (lIIIIIllIll(chatMessage.getType(), ChatMessageType.SPAM) && lIIIIIllIll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (lIIIIIlllII(chatMessage.getMessage().equals(lIIlIIIll[lIIlIllII[4]]) ? 1 : 0)) {
            this.bK = lIIlIllII[1];
            this.bI = lIIlIllII[1];
            "".length();
            if ("  ".length() <= " ".length()) {
            }
        } else if (!lIIIIIlIlll(chatMessage.getMessage().contains(lIIlIIIll[lIIlIllII[1]]) ? 1 : 0) || !lIIIIIlIlll(chatMessage.getMessage().contains(lIIlIIIll[lIIlIllII[3]]) ? 1 : 0) || lIIIIIlllII(chatMessage.getMessage().contains(lIIlIIIll[lIIlIllII[2]]) ? 1 : 0)) {
            this.bK = lIIlIllII[4];
            this.bL = null;
            "".length();
            if ("   ".length() <= (-" ".length())) {
            }
        } else if (!lIIIIIlllII(chatMessage.getMessage().startsWith(lIIlIIIll[lIIlIllII[11]]) ? 1 : 0)) {
            if (!lIIIIIlIlll(chatMessage.getMessage().equals(lIIlIIIll[lIIlIllII[12]]) ? 1 : 0) || lIIIIIlllII(chatMessage.getMessage().equals(lIIlIIIll[lIIlIllII[8]]) ? 1 : 0)) {
                this.bH = null;
            }
        } else {
            if (lIIIIIllIIl(this.bL) && lIIIIIlllIl(this.bH)) {
                if (lIIIIIlllII(this.bI ? 1 : 0)) {
                    this.bI = lIIlIllII[4];
                    "".length();
                    if (0 != 0) {
                        return;
                    }
                } else {
                    LocalPoint fromWorld = LocalPoint.fromWorld(this.v, this.bH);
                    if (lIIIIIlllIl(fromWorld)) {
                        GameObject[] gameObjects = this.v.getScene().getTiles()[this.v.getPlane()][fromWorld.getSceneX()][fromWorld.getSceneY()].getGameObjects();
                        if (lIIIIIllllI(gameObjects.length) && lIIIIIllIII(this.v.getLocalPlayer().getWorldLocation().distanceTo(gameObjects[lIIlIllII[4]].getWorldLocation()), lIIlIllII[3])) {
                            this.bK = lIIlIllII[1];
                            this.bM = this.v.getWorld();
                            this.bN = gameObjects[lIIlIllII[4]];
                            this.bL = f(this.bN.getWorldLocation());
                        }
                    }
                }
                this.bH = null;
            }
            this.bG = lIIlIllII[4];
            "".length();
            if (0 != 0) {
            }
        }
    }

    protected Class<?>[] tasks() {
        Class<?>[] clsArr = new Class[lIIlIllII[3]];
        clsArr[lIIlIllII[4]] = K.class;
        clsArr[lIIlIllII[1]] = L.class;
        return clsArr;
    }

    private static boolean lIIIIIllllI(int i2) {
        return i2 > 0;
    }

    protected void onStart() {
        this.bB.invoke(() -> {
            this.bJ = this.v.getVarpValue(lIIlIllII[2]);
        });
    }

    public boolean aA() {
        return this.bK;
    }

    public WorldArea aB() {
        return this.bL;
    }

    private static boolean lIIIIIllIlI(Object obj, Object obj2) {
        return obj == obj2;
    }

    private static boolean lIIIIIllIIl(Object obj) {
        return obj == null;
    }

    private static String llllllIIIl(String llIIIllllIIlIII, String llIIIllllIIIlll) {
        String llIIIllllIIlIII2 = new String(Base64.getDecoder().decode(llIIIllllIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIllllIIIllI = new StringBuilder();
        char[] llIIIllllIIIlIl = llIIIllllIIIlll.toCharArray();
        int llIIIllllIIIlII = lIIlIllII[4];
        char[] charArray = llIIIllllIIlIII2.toCharArray();
        int length = charArray.length;
        int i2 = lIIlIllII[4];
        while (lIIIIIlllll(i2, length)) {
            llIIIllllIIIllI.append((char) (charArray[i2] ^ llIIIllllIIIlIl[llIIIllllIIIlII % llIIIllllIIIlIl.length]));
            "".length();
            llIIIllllIIIlII++;
            i2++;
            "".length();
            if ((61 ^ 57) < (-" ".length())) {
                return null;
            }
        }
        return String.valueOf(llIIIllllIIIllI);
    }

    private static String lllllIllll(String llIIIllllIllIII, String llIIIllllIlIlll) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIllllIlIlll.getBytes(StandardCharsets.UTF_8)), lIIlIllII[13]), "DES");
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(lIIlIllII[3], secretKeySpec);
            return new String(cipher.doFinal(Base64.getDecoder().decode(llIIIllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIllllIllIIl) {
            llIIIllllIllIIl.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIlllII(int i2) {
        return i2 != 0;
    }

    private static WorldArea f(WorldPoint worldPoint) {
        return new WorldArea(worldPoint.getX() - lIIlIllII[1], worldPoint.getY() - lIIlIllII[1], lIIlIllII[2], lIIlIllII[2], worldPoint.getPlane());
    }

    private static boolean lIIIIIllIll(Object obj, Object obj2) {
        return obj != obj2;
    }

    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        GameObject gameObject = gameObjectSpawned.getGameObject();
        Player localPlayer = this.v.getLocalPlayer();
        if ((!lIIIIIlIlIl(gameObject.getId(), lIIlIllII[5]) || lIIIIIlIllI(gameObject.getId(), lIIlIllII[6])) && lIIIIIlIlll(this.bK ? 1 : 0) && lIIIIIllIII(localPlayer.getWorldLocation().distanceTo(gameObject.getWorldLocation()), lIIlIllII[3]) && lIIIIIlIllI(localPlayer.getAnimation(), lIIlIllII[7])) {
            this.bL = f(gameObject.getWorldLocation());
            this.bM = this.v.getWorld();
            this.bN = gameObject;
        }
    }

    private static boolean lIIIIIlIlll(int i2) {
        return i2 == 0;
    }

    public int aC() {
        return this.bM;
    }

    public int az() {
        return this.bJ;
    }

    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        if (lIIIIIllIIl(this.bL)) {
            if (lIIIIIlIlIl(menuOptionClicked.getId(), lIIlIllII[8]) && lIIIIIlIlIl(menuOptionClicked.getId(), lIIlIllII[9])) {
                return;
            }
            if (lIIIIIllIlI(menuOptionClicked.getMenuAction(), MenuAction.WIDGET_TARGET_ON_GAME_OBJECT) && lIIIIIlIllI(this.v.getSelectedWidget().getId(), WidgetInfo.INVENTORY.getId())) {
                int itemId = this.v.getSelectedWidget().getItemId();
                if (lIIIIIlIlIl(itemId, lIIlIllII[3]) && lIIIIIlIlIl(itemId, lIIlIllII[10])) {
                    return;
                }
                "".length();
                if ((((((59 + 78) - 78) + 171) ^ (((118 + 30) - 35) + 79)) & (((145 ^ 193) ^ (120 ^ 14)) ^ (-" ".length()))) != 0) {
                    return;
                }
            } else if (lIIIIIllIll(menuOptionClicked.getMenuAction(), MenuAction.GAME_OBJECT_FIRST_OPTION)) {
                return;
            }
            this.bH = WorldPoint.fromScene(this.v, menuOptionClicked.getParam0(), menuOptionClicked.getParam1(), this.v.getPlane());
        }
    }

    private static String llllllIlII(String llIIIlllllIIlIl, String llIIIlllllIIlII) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlllllIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIlllllIIlll = Cipher.getInstance("Blowfish");
            llIIIlllllIIlll.init(lIIlIllII[3], secretKeySpec);
            return new String(llIIIlllllIIlll.doFinal(Base64.getDecoder().decode(llIIIlllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        } catch (Exception llIIIlllllIIllI) {
            llIIIlllllIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIllIII(int i2, int i3) {
        return i2 <= i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    protected void onStop() {
        this.bK = lIIlIllII[4];
        this.bM = lIIlIllII[0];
        this.bL = null;
        this.bJ = lIIlIllII[4];
    }

    private static boolean lIIIIIlllIl(Object obj) {
        return obj != null;
    }

    @Subscribe
    public void c(VarbitChanged varbitChanged) {
        if (lIIIIIlIllI(varbitChanged.getVarpId(), lIIlIllII[2])) {
            this.bJ = varbitChanged.getValue();
        }
    }

    private static boolean lIIIIIlIlIl(int i2, int i3) {
        return i2 != i3;
    }

    private static boolean lIIIIIlIllI(int i2, int i3) {
        return i2 == i3;
    }

    public List<WorldPoint> aE() {
        return this.bO;
    }

    private static void lIIIIIlIIll() {
        lIIlIIIll = new String[lIIlIllII[5]];
        lIIlIIIll[lIIlIllII[4]] = lllllIllll("gR7iidemFBtshu0pG79nbavCANkTy8q5", "hxpuZ");
        lIIlIIIll[lIIlIllII[1]] = llllllIIIl("CgMyWTs6DyxZPiNMMxEucw8mFyU8Ag==", "SlGyK");
        lIIlIIIll[lIIlIllII[3]] = lllllIllll("WZRS1KrULb7hs3AFPr6GW1QRmiIOhJTiP4Pq1qA4QjWTwDmGLUYTu8UvkVFQ+i/k/cc1VTKUbu7G85JxVp6gfA==", "EgKMa");
        lIIlIIIll[lIIlIllII[2]] = llllllIIIl("CwMcJEgxDQc4BzxMATcbcg4MMwZyCAwlHCADEDMMcw==", "RliVh");
        lIIlIIIll[lIIlIllII[11]] = lllllIllll("a65xhffw9fSE/XfLteGf+wFQfh/OsT4jROX397RGqMg=", "DxAFY");
        lIIlIIIll[lIIlIllII[12]] = llllllIlII("k1UG/a0gxxe+5SKpq8oeWWrxelLgWIPl", "cGLve");
        lIIlIIIll[lIIlIllII[8]] = lllllIllll("TiOJE1pk8s/NdqMjN3IWjMZR+g9ifIgpp4VqTGxmrbU=", "cKodk");
    }
}
