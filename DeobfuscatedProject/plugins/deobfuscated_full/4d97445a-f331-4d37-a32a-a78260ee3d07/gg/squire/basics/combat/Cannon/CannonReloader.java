/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameObject
 *  net.runelite.api.MenuAction
 *  net.runelite.api.Player
 *  net.runelite.api.coords.LocalPoint
 *  net.runelite.api.coords.WorldArea
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameObjectSpawned
 *  net.runelite.api.events.MenuOptionClicked
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetInfo
 *  net.runelite.client.callback.ClientThread
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 */
package gg.squire.basics.combat.Cannon;

import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import i.i.b.s.c.q.r.s.s.-.u.a.e.K;
import i.i.b.s.c.q.r.s.s.-.u.a.e.L;
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
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;

@SquireUtil
@PluginDescriptor(name="Squire Cannon Reloader", description="Reloads cannon when it runs out of ammo", enabledByDefault=false)
public class CannonReloader
extends SquirePlugin {
    private /* synthetic */ boolean bK;
    private /* synthetic */ GameObject bN;
    private /* synthetic */ WorldPoint bH;
    private /* synthetic */ List<WorldPoint> bO;
    @Inject
    private /* synthetic */ Client v;
    private static /* synthetic */ int[] lIIlIllII;
    private static /* synthetic */ String[] lIIlIIIll;
    private /* synthetic */ boolean bG;
    private /* synthetic */ int bM;
    private /* synthetic */ int bJ;
    private /* synthetic */ WorldArea bL;
    @Inject
    private /* synthetic */ ClientThread bB;
    private /* synthetic */ boolean bI;

    private static boolean lIIIIIlllll(int n2, int n3) {
        return n2 < n3;
    }

    private static void lIIIIIlIlII() {
        lIIlIllII = new int[14];
        CannonReloader.lIIlIllII[0] = -1;
        CannonReloader.lIIlIllII[1] = 1;
        CannonReloader.lIIlIllII[2] = 3;
        CannonReloader.lIIlIllII[3] = 2;
        CannonReloader.lIIlIllII[4] = (84 + 23 - 17 + 45 ^ 101 + 79 - 130 + 116) & (0x4B ^ 0x74 ^ (0x36 ^ 0x28) ^ -1);
        CannonReloader.lIIlIllII[5] = 0x5D ^ 0x5A;
        CannonReloader.lIIlIllII[6] = 0xFFFFED1F & 0xBAF5;
        CannonReloader.lIIlIllII[7] = 0xFFFFAFFB & 0x533F;
        CannonReloader.lIIlIllII[8] = 0xE4 ^ 0x9E ^ (0x39 ^ 0x45);
        CannonReloader.lIIlIllII[9] = -(0xFFFF9FFD & 0x6567) & (0xFFFFADFF & 0xFF77);
        CannonReloader.lIIlIllII[10] = 0xFFFFD6E6 & 0x7DF9;
        CannonReloader.lIIlIllII[11] = 0x3B ^ 0x33 ^ (0x50 ^ 0x5C);
        CannonReloader.lIIlIllII[12] = 0x6E ^ 0x6B;
        CannonReloader.lIIlIllII[13] = 117 + 66 - 31 + 10 ^ 119 + 123 - 189 + 117;
    }

    public GameObject aD() {
        return this.bN;
    }

    static {
        CannonReloader.lIIIIIlIlII();
        CannonReloader.lIIIIIlIIll();
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        void llIIIlllllIllll;
        if (CannonReloader.lIIIIIllIll(chatMessage.getType(), ChatMessageType.SPAM) && CannonReloader.lIIIIIllIll(chatMessage.getType(), ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (CannonReloader.lIIIIIlllII(llIIIlllllIllll.getMessage().equals(lIIlIIIll[lIIlIllII[4]]) ? 1 : 0)) {
            llIIIllllllIIII.bK = lIIlIllII[1];
            llIIIllllllIIII.bI = lIIlIllII[1];
            0;
            if (2 <= 1) {
                return;
            }
        } else if (!CannonReloader.lIIIIIlIlll(llIIIlllllIllll.getMessage().contains(lIIlIIIll[lIIlIllII[1]]) ? 1 : 0) || !CannonReloader.lIIIIIlIlll(llIIIlllllIllll.getMessage().contains(lIIlIIIll[lIIlIllII[3]]) ? 1 : 0) || CannonReloader.lIIIIIlllII(llIIIlllllIllll.getMessage().contains(lIIlIIIll[lIIlIllII[2]]) ? 1 : 0)) {
            llIIIllllllIIII.bK = lIIlIllII[4];
            llIIIllllllIIII.bL = null;
            0;
            if (3 <= -1) {
                return;
            }
        } else if (CannonReloader.lIIIIIlllII(llIIIlllllIllll.getMessage().startsWith(lIIlIIIll[lIIlIllII[11]]) ? 1 : 0)) {
            CannonReloader llIIIllllllIIII;
            if (CannonReloader.lIIIIIllIIl(llIIIllllllIIII.bL) && CannonReloader.lIIIIIlllIl(llIIIllllllIIII.bH)) {
                if (CannonReloader.lIIIIIlllII(llIIIllllllIIII.bI ? 1 : 0)) {
                    llIIIllllllIIII.bI = lIIlIllII[4];
                    0;
                    
                    }
                } else {
                    GameObject[] llIIIlllllIllIl;
                    LocalPoint llIIIlllllIlllI = LocalPoint.fromWorld((Client)llIIIllllllIIII.v, (WorldPoint)llIIIllllllIIII.bH);
                    if (CannonReloader.lIIIIIlllIl(llIIIlllllIlllI) && CannonReloader.lIIIIIllllI((llIIIlllllIllIl = llIIIllllllIIII.v.getScene().getTiles()[llIIIllllllIIII.v.getPlane()][llIIIlllllIlllI.getSceneX()][llIIIlllllIlllI.getSceneY()].getGameObjects()).length) && CannonReloader.lIIIIIllIII(llIIIllllllIIII.v.getLocalPlayer().getWorldLocation().distanceTo(llIIIlllllIllIl[lIIlIllII[4]].getWorldLocation()), lIIlIllII[3])) {
                        llIIIllllllIIII.bK = lIIlIllII[1];
                        llIIIllllllIIII.bM = llIIIllllllIIII.v.getWorld();
                        llIIIllllllIIII.bN = llIIIlllllIllIl[lIIlIllII[4]];
                        llIIIllllllIIII.bL = CannonReloader.f(llIIIllllllIIII.bN.getWorldLocation());
                    }
                }
                llIIIllllllIIII.bH = null;
            }
            llIIIllllllIIII.bG = lIIlIllII[4];
            0;
            
            }
        } else if (!CannonReloader.lIIIIIlIlll(llIIIlllllIllll.getMessage().equals(lIIlIIIll[lIIlIllII[12]]) ? 1 : 0) || CannonReloader.lIIIIIlllII(llIIIlllllIllll.getMessage().equals(lIIlIIIll[lIIlIllII[8]]) ? 1 : 0)) {
            llIIIllllllIIII.bH = null;
        }
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIIlIllII[3]];
        classArray[CannonReloader.lIIlIllII[4]] = K.class;
        classArray[CannonReloader.lIIlIllII[1]] = L.class;
        return classArray;
    }

    private static boolean lIIIIIllllI(int n2) {
        return n2 > 0;
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

    private static boolean lIIIIIllIlI(Object object, Object object2) {
        return object == object2;
    }

    private static boolean lIIIIIllIIl(Object object) {
        return object == null;
    }

    private static String llllllIIIl(String llIIIllllIIIIll, String llIIIllllIIIlll) {
        llIIIllllIIIIll = new String(Base64.getDecoder().decode(llIIIllllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder llIIIllllIIIllI = new StringBuilder();
        char[] llIIIllllIIIlIl = llIIIllllIIIlll.toCharArray();
        int llIIIllllIIIlII = lIIlIllII[4];
        char[] llIIIlllIlllllI = llIIIllllIIIIll.toCharArray();
        int llIIIlllIllllIl = llIIIlllIlllllI.length;
        int llIIIlllIllllII = lIIlIllII[4];
        while (CannonReloader.lIIIIIlllll(llIIIlllIllllII, llIIIlllIllllIl)) {
            char llIIIllllIIlIIl = llIIIlllIlllllI[llIIIlllIllllII];
            llIIIllllIIIllI.append((char)(llIIIllllIIlIIl ^ llIIIllllIIIlIl[llIIIllllIIIlII % llIIIllllIIIlIl.length]));
            0;
            ++llIIIllllIIIlII;
            ++llIIIlllIllllII;
            0;
            if ((0x3D ^ 0x39) >= -1) continue;
            return null;
        }
        return String.valueOf(llIIIllllIIIllI);
    }

    private static String lllllIllll(String llIIIllllIllIII, String llIIIllllIlIlIl) {
        try {
            SecretKeySpec llIIIllllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIllllIlIlIl.getBytes(StandardCharsets.UTF_8)), lIIlIllII[13]), "DES");
            Cipher llIIIllllIllIlI = Cipher.getInstance("DES");
            llIIIllllIllIlI.init(lIIlIllII[3], llIIIllllIllIll);
            return new String(llIIIllllIllIlI.doFinal(Base64.getDecoder().decode(llIIIllllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIllllIllIIl) {
            llIIIllllIllIIl.printStackTrace();
            return null;
        }
    }

    public CannonReloader() {
        this.bM = lIIlIllII[0];
        this.bO = new ArrayList<WorldPoint>();
    }

    private static boolean lIIIIIlllII(int n2) {
        return n2 != 0;
    }

    private static WorldArea f(WorldPoint worldPoint) {
        return new WorldArea(worldPoint.getX() - lIIlIllII[1], worldPoint.getY() - lIIlIllII[1], lIIlIllII[2], lIIlIllII[2], worldPoint.getPlane());
    }

    private static boolean lIIIIIllIll(Object object, Object object2) {
        return object != object2;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameObjectSpawned gameObjectSpawned) {
        void llIIlIIIIIIIIlI;
        void llIIlIIIIIIIIIl;
        CannonReloader llIIlIIIIIIIlII;
        GameObject gameObject = gameObjectSpawned.getGameObject();
        Player player = this.v.getLocalPlayer();
        if ((!CannonReloader.lIIIIIlIlIl(gameObject.getId(), lIIlIllII[5]) || CannonReloader.lIIIIIlIllI(gameObject.getId(), lIIlIllII[6])) && CannonReloader.lIIIIIlIlll(llIIlIIIIIIIlII.bK ? 1 : 0) && CannonReloader.lIIIIIllIII(llIIlIIIIIIIIIl.getWorldLocation().distanceTo(llIIlIIIIIIIIlI.getWorldLocation()), lIIlIllII[3]) && CannonReloader.lIIIIIlIllI(llIIlIIIIIIIIIl.getAnimation(), lIIlIllII[7])) {
            llIIlIIIIIIIlII.bL = CannonReloader.f(llIIlIIIIIIIIlI.getWorldLocation());
            llIIlIIIIIIIlII.bM = llIIlIIIIIIIlII.v.getWorld();
            llIIlIIIIIIIlII.bN = llIIlIIIIIIIIlI;
        }
    }

    private static boolean lIIIIIlIlll(int n2) {
        return n2 == 0;
    }

    public int aC() {
        return this.bM;
    }

    public int az() {
        return this.bJ;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(MenuOptionClicked menuOptionClicked) {
        CannonReloader llIIIllllllllII;
        void llIIIlllllllIll;
        if (!CannonReloader.lIIIIIllIIl(this.bL) || CannonReloader.lIIIIIlIlIl(menuOptionClicked.getId(), lIIlIllII[8]) && CannonReloader.lIIIIIlIlIl(menuOptionClicked.getId(), lIIlIllII[9])) {
            return;
        }
        if (CannonReloader.lIIIIIllIlI(llIIIlllllllIll.getMenuAction(), MenuAction.WIDGET_TARGET_ON_GAME_OBJECT) && CannonReloader.lIIIIIlIllI(llIIIllllllllII.v.getSelectedWidget().getId(), WidgetInfo.INVENTORY.getId())) {
            Widget llIIIlllllllIlI = llIIIllllllllII.v.getSelectedWidget();
            int llIIIlllllllIIl = llIIIlllllllIlI.getItemId();
            if (CannonReloader.lIIIIIlIlIl(llIIIlllllllIIl, lIIlIllII[3]) && CannonReloader.lIIIIIlIlIl(llIIIlllllllIIl, lIIlIllII[10])) {
                return;
            }
            0;
            if (((59 + 78 - 78 + 171 ^ 118 + 30 - 35 + 79) & (0x91 ^ 0xC1 ^ (0x78 ^ 0xE) ^ -1)) != 0) {
                return;
            }
        } else if (CannonReloader.lIIIIIllIll(llIIIlllllllIll.getMenuAction(), MenuAction.GAME_OBJECT_FIRST_OPTION)) {
            return;
        }
        this.bH = WorldPoint.fromScene((Client)this.v, (int)menuOptionClicked.getParam0(), (int)menuOptionClicked.getParam1(), (int)this.v.getPlane());
    }

    private static String llllllIlII(String llIIIlllllIIlIl, String llIIIlllllIIIlI) {
        try {
            SecretKeySpec llIIIlllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llIIIlllllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher llIIIlllllIIlll = Cipher.getInstance("Blowfish");
            llIIIlllllIIlll.init(lIIlIllII[3], llIIIlllllIlIII);
            return new String(llIIIlllllIIlll.doFinal(Base64.getDecoder().decode(llIIIlllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llIIIlllllIIllI) {
            llIIIlllllIIllI.printStackTrace();
            return null;
        }
    }

    private static boolean lIIIIIllIII(int n2, int n3) {
        return n2 <= n3;
    }

    protected void onStop() {
        this.bK = lIIlIllII[4];
        this.bM = lIIlIllII[0];
        this.bL = null;
        this.bJ = lIIlIllII[4];
    }

    private static boolean lIIIIIlllIl(Object object) {
        return object != null;
    }

    @Subscribe
    public void c(VarbitChanged varbitChanged) {
        if (CannonReloader.lIIIIIlIllI(varbitChanged.getVarpId(), lIIlIllII[2])) {
            this.bJ = varbitChanged.getValue();
        }
    }

    private static boolean lIIIIIlIlIl(int n2, int n3) {
        return n2 != n3;
    }

    private static boolean lIIIIIlIllI(int n2, int n3) {
        return n2 == n3;
    }

    public List<WorldPoint> aE() {
        return this.bO;
    }

    private static void lIIIIIlIIll() {
        lIIlIIIll = new String[lIIlIllII[5]];
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[4]] = CannonReloader."You add the furnace.";
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[1]] = CannonReloader."You pick up the cannon";
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[3]] = CannonReloader."Your cannon has decayed. Speak to Nulodion to get a new one!";
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[2]] = CannonReloader."Your cannon has been destroyed!";
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[11]] = CannonReloader."You load the cannon with";
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[12]] = CannonReloader."This isn't your cannon!";
        CannonReloader.lIIlIIIll[CannonReloader.lIIlIllII[8]] = CannonReloader."This is not your cannon.";
    }
}

