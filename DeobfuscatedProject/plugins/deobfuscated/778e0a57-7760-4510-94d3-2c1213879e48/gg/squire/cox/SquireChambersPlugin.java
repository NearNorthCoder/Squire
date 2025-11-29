/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.ImmutableSet
 *  com.google.inject.Binder
 *  com.google.inject.Provides
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  gg.squire.client.util.Log
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.Client
 *  net.runelite.api.GameState
 *  net.runelite.api.InstanceTemplates
 *  net.runelite.api.Item
 *  net.runelite.api.MessageNode
 *  net.runelite.api.Point
 *  net.runelite.api.Skill
 *  net.runelite.api.Tile
 *  net.runelite.api.coords.WorldPoint
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.GameStateChanged
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.client.callback.ClientThread
 *  net.runelite.client.chat.ChatClient
 *  net.runelite.client.chat.ChatColorType
 *  net.runelite.client.chat.ChatMessageBuilder
 *  net.runelite.client.chat.ChatMessageManager
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.config.RuneLiteConfig
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.events.ChatInput
 *  net.runelite.client.events.ConfigChanged
 *  net.runelite.client.game.ItemStack
 *  net.runelite.client.game.SpriteManager
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.plugins.loottracker.LootReceived
 *  net.runelite.client.plugins.squire.bankloadouts.BankLoadout
 *  net.runelite.client.plugins.squire.equipment.EquipmentSetup
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.runelite.client.ui.overlay.infobox.InfoBox
 *  net.runelite.client.ui.overlay.infobox.InfoBoxManager
 *  net.runelite.client.util.ImageCapture
 *  net.runelite.client.util.Text
 *  net.runelite.http.api.chat.LayoutRoom
 *  net.unethicalite.api.events.ExperienceGained
 *  net.unethicalite.api.events.InventoryChanged
 *  net.unethicalite.api.events.InventoryChanged$ChangeType
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.cox;

import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.K;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.L;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.P;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.R;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.T;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.V;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.W;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.X;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.Z;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.a;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aA;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aB;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aC;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aD;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aE;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aF;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aH;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aI;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aJ;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aK;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aL;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aM;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aN;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aO;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aP;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aQ;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aS;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aT;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aU;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aV;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aW;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aX;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aY;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aZ;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aa;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ab;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ac;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ad;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ae;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.af;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ag;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ah;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ai;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aj;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ak;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.al;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.au;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.av;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.aw;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ax;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ay;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.ba;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bb;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bc;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bd;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.be;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bf;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bh;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bi;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bj;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bk;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.bl;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.c;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.d;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.e;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.f;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.g;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.h;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.i;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.k;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.l;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.n;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.s;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u;
import c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.w;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Binder;
import com.google.inject.Provides;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.client.util.Log;
import gg.squire.cox.SquireChambersConfig;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.InstanceTemplates;
import net.runelite.api.Item;
import net.runelite.api.MessageNode;
import net.runelite.api.Point;
import net.runelite.api.Skill;
import net.runelite.api.Tile;
import net.runelite.api.coords.WorldPoint;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.GameStateChanged;
import net.runelite.api.events.VarbitChanged;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.chat.ChatClient;
import net.runelite.client.chat.ChatColorType;
import net.runelite.client.chat.ChatMessageBuilder;
import net.runelite.client.chat.ChatMessageManager;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.config.RuneLiteConfig;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.events.ChatInput;
import net.runelite.client.events.ConfigChanged;
import net.runelite.client.game.ItemStack;
import net.runelite.client.game.SpriteManager;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.plugins.loottracker.LootReceived;
import net.runelite.client.plugins.squire.bankloadouts.BankLoadout;
import net.runelite.client.plugins.squire.equipment.EquipmentSetup;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.ui.overlay.infobox.InfoBox;
import net.runelite.client.ui.overlay.infobox.InfoBoxManager;
import net.runelite.client.util.ImageCapture;
import net.runelite.client.util.Text;
import net.runelite.http.api.chat.LayoutRoom;
import net.unethicalite.api.events.ExperienceGained;
import net.unethicalite.api.events.InventoryChanged;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Squire Chambers Of Xeric", description="All squire devs know is vacation and cox", tags={"combat", "raid", "overlay", "pve", "pvm", "bosses", "cox"}, enabledByDefault=false)
@SquireUtil
public class SquireChambersPlugin
extends SquirePlugin {
    private static final /* synthetic */ DecimalFormat G;
    private /* synthetic */ int ah;
    @Inject
    private /* synthetic */ Client u;
    private static final /* synthetic */ String F;
    @Inject
    private /* synthetic */ i V;
    private /* synthetic */ int ai;
    @Inject
    private /* synthetic */ ScheduledExecutorService T;
    @Inject
    private /* synthetic */ d O;
    private static /* synthetic */ int[] lIlIIIIlIIII;
    /* synthetic */ n ak;
    @Inject
    private /* synthetic */ ImageCapture U;
    /* synthetic */ List<n> ab;
    @Inject
    private /* synthetic */ OverlayManager N;
    @Inject
    private /* synthetic */ SquireChambersConfig k;
    @Inject
    private /* synthetic */ h Y;
    @Inject
    private /* synthetic */ SpriteManager Q;
    private /* synthetic */ boolean af;
    @Inject
    private /* synthetic */ L P;
    private static final /* synthetic */ Set<Integer> J;
    private /* synthetic */ int aj;
    @Inject
    private /* synthetic */ ChatMessageManager L;
    /* synthetic */ int am;
    /* synthetic */ EquipmentSetup ao;
    /* synthetic */ EquipmentSetup an;
    @Inject
    private /* synthetic */ ChatClient S;
    private /* synthetic */ c ae;
    @Inject
    private /* synthetic */ k X;
    @Inject
    private /* synthetic */ RuneLiteConfig K;
    public static final /* synthetic */ int C;
    /* synthetic */ EquipmentSetup ap;
    private /* synthetic */ int ag;
    public static final /* synthetic */ int D;
    @Inject
    private /* synthetic */ InfoBoxManager M;
    private static final /* synthetic */ DecimalFormat H;
    @Inject
    private /* synthetic */ EventBus Z;
    private static final /* synthetic */ int I;
    private static final /* synthetic */ String E;
    private /* synthetic */ a aa;
    private /* synthetic */ boolean ac;
    private static /* synthetic */ String[] lIlIIIIIllll;
    public static final /* synthetic */ int A;
    @Inject
    private /* synthetic */ l W;
    private static final /* synthetic */ Logger z;
    /* synthetic */ EquipmentSetup aq;
    @Inject
    private /* synthetic */ ClientThread R;
    private /* synthetic */ GameState ar;
    /* synthetic */ n al;
    public static final /* synthetic */ int B;
    private /* synthetic */ int ad;

    protected void onStop() {
        this.N.remove((Overlay)this.O);
        0;
        this.M.removeInfoBox((InfoBox)this.ae);
        this.ae = null;
        this.ac = lIlIIIIlIIII[0];
        this.w();
        this.Z.unregister((Object)this.W);
        this.Z.unregister((Object)this.V);
        this.Z.unregister((Object)this.X);
        this.Z.unregister((Object)this.Y);
    }

    public void g(int n2) {
        this.aj = n2;
    }

    public EquipmentSetup P() {
        return this.ao;
    }

    public int N() {
        return this.am;
    }

    private static boolean llIlIlIIlIlIll(int n2, int n3) {
        return n2 != n3;
    }

    public int K() {
        return this.aj;
    }

    private boolean a(ChatInput chatInput, String string) {
        if (SquireChambersPlugin.llIlIlIIlIllII(this.aa)) {
            return lIlIIIIlIIII[0];
        }
        String string2 = this.u.getLocalPlayer().getName();
        List<N> list = this.aa.e();
        LayoutRoom[] layoutRoomArray = (LayoutRoom[])list.stream().map(n2 -> LayoutRoom.valueOf((String)n2.name())).toArray(LayoutRoom[]::new);
        this.T.execute(() -> {
            block7: {
                try {
                    SquireChambersPlugin lllllllllllllllIlllIIIllIllIlllI;
                    lllllllllllllllIlllIIIllIllIlllI.S.submitLayout(string2, layoutRoomArray);
                    0;
                    0;
                }
                catch (Exception lllllllllllllllIlllIIIllIllIlIlI) {
                    z.warn(lIlIIIIIllll[lIlIIIIlIIII[30]], (Throwable)lllllllllllllllIlllIIIllIllIlIlI);
                    0;
                    if (3 <= 0) {
                        return;
                    }
                    break block7;
                }
                finally {
                    chatInput.resume();
                }
                if (((0x20 ^ 0x7B) & ~(0xC1 ^ 0x9A)) != 0) {
                    return;
                }
            }
        });
        return lIlIIIIlIIII[3];
    }

    private static boolean llIlIlIIlIlIIl(Object object, Object object2) {
        return object == object2;
    }

    /*
     * WARNING - void declaration
     */
    public boolean x() {
        void var1_2;
        int[] nArray = new int[lIlIIIIlIIII[3]];
        nArray[SquireChambersPlugin.lIlIIIIlIIII[0]] = lIlIIIIlIIII[66];
        if (SquireChambersPlugin.llIlIlIIlIIllI(Inventory.contains((int[])nArray) ? 1 : 0)) {
            void lllllllllllllllIlllIIIllIlllllIl;
            int[] nArray2 = new int[lIlIIIIlIIII[3]];
            nArray2[SquireChambersPlugin.lIlIIIIlIIII[0]] = lIlIIIIlIIII[66];
            Item item2 = Inventory.getFirst((int[])nArray2);
            if (SquireChambersPlugin.llIlIlIIlIllII(item2)) {
                return lIlIIIIlIIII[0];
            }
            lllllllllllllllIlllIIIllIlllllIl.interact(lIlIIIIIllll[lIlIIIIlIIII[23]]);
            return lIlIIIIlIIII[3];
        }
        Item lllllllllllllllIlllIIIllIlllllIl = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIllll[lIlIIIIlIIII[29]]));
        if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIllIlllllIl)) {
            lllllllllllllllIlllIIIllIlllllIl = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIllll[lIlIIIIlIIII[28]]));
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIllIlllllIl)) {
            lllllllllllllllIlllIIIllIlllllIl = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIllll[lIlIIIIlIIII[27]]));
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIllIlllllIl)) {
            lllllllllllllllIlllIIIllIlllllIl = Inventory.getFirst(item -> item.getName().startsWith(lIlIIIIIllll[lIlIIIIlIIII[26]]));
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIllIlllllIl)) {
            return lIlIIIIlIIII[0];
        }
        var1_2.drop();
        return lIlIIIIlIIII[3];
    }

    /*
     * WARNING - void declaration
     */
    private a a(a a2) {
        int n2;
        a lllllllllllllllIlllIIIlllIllIlIl;
        SquireChambersPlugin lllllllllllllllIlllIIIlllIllIlll;
        a a3 = a2;
        if (SquireChambersPlugin.llIlIlIIlIllII(a3)) {
            void lllllllllllllllIlllIIIlllIllIlII;
            Point point = this.v();
            if (SquireChambersPlugin.llIlIlIIlIllII(point)) {
                return null;
            }
            Integer lllllllllllllllIlllIIIlllIllIIll = lllllllllllllllIlllIIIlllIllIlll.a((Point)lllllllllllllllIlllIIIlllIllIlII);
            if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIlllIllIIll)) {
                return null;
            }
            lllllllllllllllIlllIIIlllIllIlIl = new a(new WorldPoint(lllllllllllllllIlllIIIlllIllIlll.u.getBaseX() + lllllllllllllllIlllIIIlllIllIlII.getX(), lllllllllllllllIlllIIIlllIllIlll.u.getBaseY() + lllllllllllllllIlllIIIlllIllIlII.getY(), lIlIIIIlIIII[5]), lllllllllllllllIlllIIIlllIllIIll);
        }
        int lllllllllllllllIlllIIIlllIllIlII = lllllllllllllllIlllIIIlllIllIlIl.l() % lIlIIIIlIIII[6];
        if (SquireChambersPlugin.llIlIlIIlIllll(lllllllllllllllIlllIIIlllIllIlIl.l() % lIlIIIIlIIII[10], lIlIIIIlIIII[5])) {
            n2 = lIlIIIIlIIII[3];
            0;
            if ((2 & ~2) == (0x34 ^ 0x30)) {
                return null;
            }
        } else {
            n2 = lIlIIIIlIIII[0];
        }
        int lllllllllllllllIlllIIIlllIllIIll = n2;
        int lllllllllllllllIlllIIIlllIllIIlI = lIlIIIIlIIII[0];
        while (SquireChambersPlugin.llIlIlIIlIlIII(lllllllllllllllIlllIIIlllIllIIlI, lllllllllllllllIlllIIIlllIllIlIl.h().length)) {
            int n3;
            int lllllllllllllllIlllIIIlllIllIIII;
            int n4;
            int lllllllllllllllIlllIIIlllIllIIIl = lllllllllllllllIlllIIIlllIllIIlI % lIlIIIIlIIII[6];
            if (SquireChambersPlugin.llIlIlIIlIllll(lllllllllllllllIlllIIIlllIllIIlI % lIlIIIIlIIII[10], lIlIIIIlIIII[5])) {
                n4 = lIlIIIIlIIII[3];
                0;
                if ((0xBC ^ 0xA8 ^ (0x33 ^ 0x23)) < 0) {
                    return null;
                }
            } else {
                n4 = lllllllllllllllIlllIIIlllIllIIII = lIlIIIIlIIII[0];
            }
            if (SquireChambersPlugin.llIlIlIIlIllll(lllllllllllllllIlllIIIlllIllIIlI, lIlIIIIlIIII[9])) {
                n3 = lIlIIIIlIIII[4];
                0;
                if ((54 + 19 - -57 + 1 ^ 64 + 52 - 31 + 50) < 0) {
                    return null;
                }
            } else {
                n3 = lIlIIIIlIIII[5];
            }
            int lllllllllllllllIlllIIIlllIlIllll = n3;
            lllllllllllllllIlllIIIlllIllIIIl -= lllllllllllllllIlllIIIlllIllIlII;
            lllllllllllllllIlllIIIlllIllIIII -= lllllllllllllllIlllIIIlllIllIIll;
            lllllllllllllllIlllIIIlllIllIIIl = lllllllllllllllIlllIIIlllIllIlIl.k().getX() + lllllllllllllllIlllIIIlllIllIIIl * lIlIIIIlIIII[34];
            lllllllllllllllIlllIIIlllIllIIII = lllllllllllllllIlllIIIlllIllIlIl.k().getY() - lllllllllllllllIlllIIIlllIllIIII * lIlIIIIlIIII[34];
            lllllllllllllllIlllIIIlllIllIIII -= lllllllllllllllIlllIIIlllIllIlll.u.getBaseY();
            if (SquireChambersPlugin.llIlIlIIllIIII(lllllllllllllllIlllIIIlllIllIIIl -= lllllllllllllllIlllIIIlllIllIlll.u.getBaseX(), lIlIIIIlIIII[64])) {
                if (SquireChambersPlugin.llIlIlIIllIIII(lllllllllllllllIlllIIIlllIllIIIl, lIlIIIIlIIII[62])) {
                    0;
                    if ((147 + 61 - 78 + 33 ^ 135 + 27 - 72 + 77) != (2 ^ (0xB9 ^ 0xBF))) {
                        return null;
                    }
                } else {
                    Tile lllllllllllllllIlllIIIlllIlIlllI;
                    if (SquireChambersPlugin.llIlIlIIlIlIII(lllllllllllllllIlllIIIlllIllIIIl, lIlIIIIlIIII[3])) {
                        lllllllllllllllIlllIIIlllIllIIIl = lIlIIIIlIIII[3];
                    }
                    if (SquireChambersPlugin.llIlIlIIlIlIII(lllllllllllllllIlllIIIlllIllIIII, lIlIIIIlIIII[3])) {
                        lllllllllllllllIlllIIIlllIllIIII = lIlIIIIlIIII[3];
                    }
                    if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIlllIlIlllI = lllllllllllllllIlllIIIlllIllIlll.u.getScene().getTiles()[lllllllllllllllIlllIIIlllIlIllll][lllllllllllllllIlllIIIlllIllIIIl][lllllllllllllllIlllIIIlllIllIIII])) {
                        0;
                        if (2 > 3) {
                            return null;
                        }
                    } else {
                        N lllllllllllllllIlllIIIlllIlIllIl = lllllllllllllllIlllIIIlllIllIlll.b(lllllllllllllllIlllIIIlllIlIlllI);
                        lllllllllllllllIlllIIIlllIllIlIl.a(lllllllllllllllIlllIIIlllIlIllIl, lllllllllllllllIlllIIIlllIllIIlI);
                    }
                }
            }
            ++lllllllllllllllIlllIIIlllIllIIlI;
            0;
            if (((0x4E ^ 0x7C) & ~(0 ^ 0x32)) == 0) continue;
            return null;
        }
        return a3;
    }

    private static void llIlIlIIlIIlIl() {
        lIlIIIIlIIII = new int[79];
        SquireChambersPlugin.lIlIIIIlIIII[0] = (0x5C ^ 0x62) & ~(0x58 ^ 0x66);
        SquireChambersPlugin.lIlIIIIlIIII[1] = 0xC ^ 0x3E;
        SquireChambersPlugin.lIlIIIIlIIII[2] = 0x56 ^ 0x6E;
        SquireChambersPlugin.lIlIIIIlIIII[3] = 1;
        SquireChambersPlugin.lIlIIIIlIIII[4] = 2;
        SquireChambersPlugin.lIlIIIIlIIII[5] = 3;
        SquireChambersPlugin.lIlIIIIlIIII[6] = 0xC ^ 8;
        SquireChambersPlugin.lIlIIIIlIIII[7] = 17 + 108 - 4 + 32 ^ 84 + 131 - 214 + 155;
        SquireChambersPlugin.lIlIIIIlIIII[8] = 0xB7 ^ 0xB1;
        SquireChambersPlugin.lIlIIIIlIIII[9] = 0x5F ^ 0x58;
        SquireChambersPlugin.lIlIIIIlIIII[10] = 0x10 ^ 0x18;
        SquireChambersPlugin.lIlIIIIlIIII[11] = 3 ^ 0x51 ^ (0x77 ^ 0x2C);
        SquireChambersPlugin.lIlIIIIlIIII[12] = 0x53 ^ 0x6D ^ (4 ^ 0x30);
        SquireChambersPlugin.lIlIIIIlIIII[13] = 0x24 ^ 0x2F;
        SquireChambersPlugin.lIlIIIIlIIII[14] = 0x8F ^ 0x83;
        SquireChambersPlugin.lIlIIIIlIIII[15] = 0x89 ^ 0x84;
        SquireChambersPlugin.lIlIIIIlIIII[16] = 0x37 ^ 0x7D ^ (0xB ^ 0x4F);
        SquireChambersPlugin.lIlIIIIlIIII[17] = 32 + 65 - 20 + 58 ^ 42 + 99 - 122 + 117;
        SquireChambersPlugin.lIlIIIIlIIII[18] = 0x53 ^ 0x26 ^ (0xD7 ^ 0xB2);
        SquireChambersPlugin.lIlIIIIlIIII[19] = 0x10 ^ 1;
        SquireChambersPlugin.lIlIIIIlIIII[20] = 0x9F ^ 0x8D;
        SquireChambersPlugin.lIlIIIIlIIII[21] = 0x5B ^ 0x38 ^ (0x68 ^ 0x18);
        SquireChambersPlugin.lIlIIIIlIIII[22] = 0x9F ^ 0x80 ^ (0xBD ^ 0xB6);
        SquireChambersPlugin.lIlIIIIlIIII[23] = 137 + 96 - 175 + 89 ^ 56 + 113 - 154 + 119;
        SquireChambersPlugin.lIlIIIIlIIII[24] = 0x5E ^ 0x48;
        SquireChambersPlugin.lIlIIIIlIIII[25] = 148 + 102 - 127 + 35 ^ 100 + 41 - 81 + 77;
        SquireChambersPlugin.lIlIIIIlIIII[26] = 0x4C ^ 0x35 ^ (4 ^ 0x65);
        SquireChambersPlugin.lIlIIIIlIIII[27] = 0x8A ^ 0x81 ^ (0x2B ^ 0x39);
        SquireChambersPlugin.lIlIIIIlIIII[28] = 153 + 54 - 94 + 54 ^ 128 + 66 - 50 + 45;
        SquireChambersPlugin.lIlIIIIlIIII[29] = 0x42 ^ 0x79 ^ (0x59 ^ 0x79);
        SquireChambersPlugin.lIlIIIIlIIII[30] = 0xD9 ^ 0xC5;
        SquireChambersPlugin.lIlIIIIlIIII[31] = 0x5D ^ 0x40;
        SquireChambersPlugin.lIlIIIIlIIII[32] = 0xB1 ^ 0xAF;
        SquireChambersPlugin.lIlIIIIlIIII[33] = 11 + 65 - -22 + 81 ^ 116 + 102 - 168 + 122;
        SquireChambersPlugin.lIlIIIIlIIII[34] = 0x32 ^ 0x52 ^ (0xE ^ 0x4E);
        SquireChambersPlugin.lIlIIIIlIIII[35] = 0x3D ^ 8 ^ (0x65 ^ 0x71);
        SquireChambersPlugin.lIlIIIIlIIII[36] = 30 + 92 - 93 + 122 ^ 86 + 23 - -24 + 48;
        SquireChambersPlugin.lIlIIIIlIIII[37] = 38 + 173 - 63 + 80 ^ 151 + 166 - 234 + 116;
        SquireChambersPlugin.lIlIIIIlIIII[38] = 71 + 155 - 57 + 56 ^ 63 + 149 - 110 + 95;
        SquireChambersPlugin.lIlIIIIlIIII[39] = 0x73 ^ 0x56;
        SquireChambersPlugin.lIlIIIIlIIII[40] = 0x53 ^ 0x75;
        SquireChambersPlugin.lIlIIIIlIIII[41] = 0xA1 ^ 0x9B ^ (0x3B ^ 0x26);
        SquireChambersPlugin.lIlIIIIlIIII[42] = 0xAC ^ 0x84;
        SquireChambersPlugin.lIlIIIIlIIII[43] = 0x1A ^ 0x33;
        SquireChambersPlugin.lIlIIIIlIIII[44] = 0x7E ^ 0x54;
        SquireChambersPlugin.lIlIIIIlIIII[45] = 0xEC ^ 0xC7;
        SquireChambersPlugin.lIlIIIIlIIII[46] = 0x76 ^ 0x5A;
        SquireChambersPlugin.lIlIIIIlIIII[47] = 0x5F ^ 0x72;
        SquireChambersPlugin.lIlIIIIlIIII[48] = 0x68 ^ 0x46;
        SquireChambersPlugin.lIlIIIIlIIII[49] = 0x94 ^ 0x84 ^ (0xFF ^ 0xC0);
        SquireChambersPlugin.lIlIIIIlIIII[50] = 0xC0 ^ 0x83 ^ (0x25 ^ 0x56);
        SquireChambersPlugin.lIlIIIIlIIII[51] = 0x27 ^ 0x5B ^ (0x3E ^ 0x73);
        SquireChambersPlugin.lIlIIIIlIIII[52] = 0x4E ^ 0x79 ^ (0xA3 ^ 0xA7);
        SquireChambersPlugin.lIlIIIIlIIII[53] = 0x28 ^ 0x6E ^ (0xCD ^ 0xBF);
        SquireChambersPlugin.lIlIIIIlIIII[54] = 162 + 211 - 264 + 137 ^ 8 + 130 - 122 + 179;
        SquireChambersPlugin.lIlIIIIlIIII[55] = 0x6E ^ 0x58;
        SquireChambersPlugin.lIlIIIIlIIII[56] = 0xB2 ^ 0x85;
        SquireChambersPlugin.lIlIIIIlIIII[57] = -(0xFFFFAE21 & 0x7DFF) & (0xFFFFFFF7 & 0x7DBD);
        SquireChambersPlugin.lIlIIIIlIIII[58] = -(0xFFFFAF63 & 0x7EDD) & (0xFFFFFF7F & Short.MAX_VALUE);
        SquireChambersPlugin.lIlIIIIlIIII[59] = -(0xFFFFDAFD & 0x7D4F) & (0xFFFFFDFF & 0x5FDF);
        SquireChambersPlugin.lIlIIIIlIIII[60] = -1;
        SquireChambersPlugin.lIlIIIIlIIII[61] = 0xFFFFB7FD & 0x5D3A;
        SquireChambersPlugin.lIlIIIIlIIII[62] = 0x23 ^ 0x4B;
        SquireChambersPlugin.lIlIIIIlIIII[63] = -(0xFFFFD035 & 0x7FDB) & (0xFFFFFFFF & 0x7FD7);
        SquireChambersPlugin.lIlIIIIlIIII[64] = -(0x55 ^ 0x4A);
        SquireChambersPlugin.lIlIIIIlIIII[65] = 0xFFFFCFAC & 0x317F;
        SquireChambersPlugin.lIlIIIIlIIII[66] = 0xFFFFD9FF & 0x7793;
        SquireChambersPlugin.lIlIIIIlIIII[67] = 0xFFFFBDF4 & 0x775F;
        SquireChambersPlugin.lIlIIIIlIIII[68] = -(0xFFFFBBDB & 0x6CF6) & (0xFFFFFAFB & Short.MAX_VALUE);
        SquireChambersPlugin.lIlIIIIlIIII[69] = -(0xFFFFF5BD & 0xFEB) & (0xFFFFDFFF & 0x77FF);
        SquireChambersPlugin.lIlIIIIlIIII[70] = -(0xFFFFDED7 & 0x252A) & (0xFFFFFE7B & 0x579F);
        SquireChambersPlugin.lIlIIIIlIIII[71] = -(0xFFFFAFEF & 0x59F3) & (0xFFFFDFFF & 0x7BFF);
        SquireChambersPlugin.lIlIIIIlIIII[72] = 0xFFFFDB39 & 0x76E6;
        SquireChambersPlugin.lIlIIIIlIIII[73] = -(0xFFFFF3E3 & 0x2DFF) & (0xFFFFFBF6 & 0x77FF);
        SquireChambersPlugin.lIlIIIIlIIII[74] = 0xFFFFD2DF & 0x7F37;
        SquireChambersPlugin.lIlIIIIlIIII[75] = -(121 + 31 - 133 + 224) & (0xFFFFFAF7 & 0x57FF);
        SquireChambersPlugin.lIlIIIIlIIII[76] = -(0xFFFFD5F1 & 0x2FCF) & (0xFFFFDFDF & 0x77EB);
        SquireChambersPlugin.lIlIIIIlIIII[77] = 0xFFFFF63B & 0x5BF7;
        SquireChambersPlugin.lIlIIIIlIIII[78] = 0xFFFFDF8F & 0x7278;
    }

    protected void onStart() {
        BankLoadout lllllllllllllllIlllIIIllllllllIl;
        SquireChambersPlugin lllllllllllllllIlllIIIlllllllllI;
        int n2;
        if (!SquireChambersPlugin.llIlIlIIlIIllI(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.be() ? 1 : 0) || SquireChambersPlugin.llIlIlIIlIIlll(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bf() ? 1 : 0)) {
            n2 = lIlIIIIlIIII[3];
            0;
            if ((0x58 ^ 0x5C) < -1) {
                return;
            }
        } else {
            n2 = lIlIIIIlIIII[0];
        }
        this.af = n2;
        lllllllllllllllIlllIIIlllllllllI.N.add((Overlay)lllllllllllllllIlllIIIlllllllllI.O);
        0;
        lllllllllllllllIlllIIIlllllllllI.Z.register((Object)lllllllllllllllIlllIIIlllllllllI.V);
        lllllllllllllllIlllIIIlllllllllI.V.T();
        lllllllllllllllIlllIIIlllllllllI.Z.register((Object)lllllllllllllllIlllIIIlllllllllI.W);
        lllllllllllllllIlllIIIlllllllllI.Z.register((Object)lllllllllllllllIlllIIIlllllllllI.X);
        lllllllllllllllIlllIIIlllllllllI.Z.register((Object)lllllllllllllllIlllIIIlllllllllI.Y);
        lllllllllllllllIlllIIIlllllllllI.Y.T();
        lllllllllllllllIlllIIIlllllllllI.R.invokeLater(lllllllllllllllIlllIIIlllllllllI::t);
        lllllllllllllllIlllIIIlllllllllI.ai = lIlIIIIlIIII[0];
        lllllllllllllllIlllIIIlllllllllI.aj = lIlIIIIlIIII[0];
        if (SquireChambersPlugin.llIlIlIIlIlIII(lllllllllllllllIlllIIIlllllllllI.r(), lIlIIIIlIIII[5])) {
            lllllllllllllllIlllIIIlllllllllI.forceStop();
            Log.error((String)lIlIIIIIllll[lIlIIIIlIIII[0]]);
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIlIII(lllllllllllllllIlllIIIlllllllllI.s(), lIlIIIIlIIII[4])) {
            lllllllllllllllIlllIIIlllllllllI.forceStop();
            Log.error((String)lIlIIIIIllll[lIlIIIIlIIII[3]]);
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(lllllllllllllllIlllIIIlllllllllI.k.enableGuardians() ? 1 : 0) && SquireChambersPlugin.llIlIlIIlIIlll((lllllllllllllllIlllIIIllllllllIl = lllllllllllllllIlllIIIlllllllllI.q()).getInventorySetup().contains(itemComposition -> itemComposition.getName().toLowerCase().contains(lIlIIIIIllll[lIlIIIIlIIII[31]])) ? 1 : 0)) {
            lllllllllllllllIlllIIIlllllllllI.forceStop();
            Log.error((String)lIlIIIIIllll[lIlIIIIlIIII[4]]);
            return;
        }
    }

    public boolean G() {
        return this.af;
    }

    @Subscribe(priority=1000.0f)
    public void a(ExperienceGained experienceGained) {
        if (SquireChambersPlugin.llIlIlIIlIlIIl(experienceGained.getSkill(), Skill.WOODCUTTING)) {
            this.ag = Static.getClient().getTickCount();
        }
    }

    private static boolean llIlIlIIlIlllI(Object object, Object object2) {
        return object != object2;
    }

    public void b(n n2) {
        this.al = n2;
    }

    /*
     * WARNING - void declaration
     */
    private void t() {
        void var1_1;
        Object lllllllllllllllIlllIIIllllIIllIl;
        int n2;
        int n3;
        SquireChambersPlugin lllllllllllllllIlllIIIllllIIllll;
        if (SquireChambersPlugin.llIlIlIIlIlllI(this.u.getGameState(), GameState.LOGGED_IN)) {
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIlIIl((Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bh(), (Object)w.REACHED_BOTTOM)) {
            lllllllllllllllIlllIIIllllIIllll.b(s.ba());
            lllllllllllllllIlllIIIllllIIllll.a(s.bc());
            lllllllllllllllIlllIIIllllIIllll.c(s.bb());
            lllllllllllllllIlllIIIllllIIllll.d(s.b(s.aZ()));
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIlIlI(lllllllllllllllIlllIIIllllIIllll.u.getVarbitValue(lIlIIIIlIIII[61]), lIlIIIIlIIII[3])) {
            n3 = lIlIIIIlIIII[3];
            0;
            if (((0x20 ^ 0x7C) & ~(0x73 ^ 0x2F)) != 0) {
                return;
            }
        } else {
            lllllllllllllllIlllIIIllllIIllll.ac = lIlIIIIlIIII[0];
            n3 = lllllllllllllllIlllIIIllllIIllll.ac ? 1 : 0;
        }
        if (SquireChambersPlugin.llIlIlIIlIIlll(lllllllllllllllIlllIIIllllIIllll.ac ? 1 : 0)) {
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIllllIIllll.aa)) {
            n2 = lIlIIIIlIIII[3];
            0;
            if ((0x1B ^ 0x5E ^ (0x87 ^ 0xC6)) > (117 + 112 - 226 + 125 ^ 12 + 105 - 60 + 75)) {
                return;
            }
        } else {
            n2 = lIlIIIIlIIII[0];
        }
        int lllllllllllllllIlllIIIllllIIlllI = n2;
        lllllllllllllllIlllIIIllllIIllll.aa = lllllllllllllllIlllIIIllllIIllll.a(lllllllllllllllIlllIIIllllIIllll.aa);
        if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIllllIIllll.aa)) {
            z.debug(lIlIIIIIllll[lIlIIIIlIIII[15]]);
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIllllIIllll.aa.j())) {
            lllllllllllllllIlllIIIllllIIllIl = lllllllllllllllIlllIIIllllIIllll.P.a(lllllllllllllllIlllIIIllllIIllll.aa.d());
            if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIllllIIllIl)) {
                z.debug(lIlIIIIIllll[lIlIIIIlIIII[16]]);
                lllllllllllllllIlllIIIllllIIllll.aa = null;
                return;
            }
            lllllllllllllllIlllIIIllllIIllll.aa.a((K)lllllllllllllllIlllIIIllllIIllIl);
        }
        lllllllllllllllIlllIIIllllIIllIl = lllllllllllllllIlllIIIllllIIllll.aa.c();
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.R.b(lllllllllllllllIlllIIIllllIIllIl);
        0;
        lllllllllllllllIlllIIIllllIIllll.aa.a((N[])lllllllllllllllIlllIIIllllIIllIl);
        lllllllllllllllIlllIIIllllIIllll.ab = n.c(lllllllllllllllIlllIIIllllIIllll.aa);
        lllllllllllllllIlllIIIllllIIllll.aj = lIlIIIIlIIII[0];
        lllllllllllllllIlllIIIllllIIllll.ai = lIlIIIIlIIII[0];
        lllllllllllllllIlllIIIllllIIllll.V.T();
        if (SquireChambersPlugin.llIlIlIIlIIllI(c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.u.bf() ? 1 : 0)) {
            lllllllllllllllIlllIIIllllIIllll.b(s.ba());
            lllllllllllllllIlllIIIllllIIllll.a(s.bc());
            lllllllllllllllIlllIIIllllIIllll.c(s.bb());
            lllllllllllllllIlllIIIllllIIllll.d(s.b(s.aZ()));
            0;
            if (3 == 0) {
                return;
            }
        } else {
            lllllllllllllllIlllIIIllllIIllll.ao = null;
            lllllllllllllllIlllIIIllllIIllll.an = null;
            lllllllllllllllIlllIIIllllIIllll.ap = null;
            lllllllllllllllIlllIIIllllIIllll.aq = null;
        }
        Log.error((String)lIlIIIIIllll[lIlIIIIlIIII[17]]);
        this.Z.post((Object)new g(this.aa, (boolean)var1_1));
    }

    public void c(EquipmentSetup equipmentSetup) {
        this.ap = equipmentSetup;
    }

    private static boolean llIlIlIIlIIlll(int n2) {
        return n2 == 0;
    }

    private static boolean llIlIlIIlIllII(Object object) {
        return object == null;
    }

    public n M() {
        return this.al;
    }

    public i y() {
        return this.V;
    }

    /*
     * WARNING - void declaration
     */
    private N b(Tile tile) {
        void lllllllllllllllIlllIIIlllIlIIlIl;
        int n2 = this.u.getInstanceTemplateChunks()[tile.getPlane()][tile.getSceneLocation().getX() / lIlIIIIlIIII[10]][tile.getSceneLocation().getY() / lIlIIIIlIIII[10]];
        InstanceTemplates instanceTemplates = InstanceTemplates.findMatch((int)n2);
        if (SquireChambersPlugin.llIlIlIIlIllII(instanceTemplates)) {
            return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.EMPTY;
        }
        switch (e.as[lllllllllllllllIlllIIIlllIlIIlIl.ordinal()]) {
            case 1: 
            case 2: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.START;
            }
            case 3: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.END;
            }
            case 4: 
            case 5: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.SCAVENGERS;
            }
            case 6: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.SHAMANS;
            }
            case 7: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.VASA;
            }
            case 8: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.VANGUARDS;
            }
            case 9: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.ICE_DEMON;
            }
            case 10: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.THIEVING;
            }
            case 11: 
            case 12: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.FARMING;
            }
            case 13: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.MUTTADILES;
            }
            case 14: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.MYSTICS;
            }
            case 15: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.TEKTON;
            }
            case 16: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.TIGHTROPE;
            }
            case 17: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.GUARDIANS;
            }
            case 18: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.CRABS;
            }
            case 19: {
                return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.VESPULA;
            }
        }
        return c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.EMPTY;
    }

    /*
     * WARNING - void declaration
     */
    private void a(ChatMessage chatMessage, String string) {
        void var6_7;
        LayoutRoom[] lllllllllllllllIlllIIIlllIIllIII;
        String lllllllllllllllIlllIIIlllIIllIIl;
        ChatMessageType chatMessageType = chatMessage.getType();
        if (SquireChambersPlugin.llIlIlIIlIIllI(chatMessageType.equals((Object)ChatMessageType.PRIVATECHATOUT) ? 1 : 0)) {
            String string2 = this.u.getLocalPlayer().getName();
            0;
            if (2 < 0) {
                return;
            }
        } else {
            void lllllllllllllllIlllIIIlllIIllIll;
            lllllllllllllllIlllIIIlllIIllIIl = Text.sanitize((String)lllllllllllllllIlllIIIlllIIllIll.getName());
        }
        try {
            SquireChambersPlugin lllllllllllllllIlllIIIlllIIlllII;
            lllllllllllllllIlllIIIlllIIllIII = lllllllllllllllIlllIIIlllIIlllII.S.getLayout(lllllllllllllllIlllIIIlllIIllIIl);
            0;
        }
        catch (IOException lllllllllllllllIlllIIIlllIIlIlll) {
            z.debug(lIlIIIIIllll[lIlIIIIlIIII[18]], (Throwable)lllllllllllllllIlllIIIlllIIlIlll);
            return;
        }
        if (2 <= -1) {
            return;
        }
        if (!SquireChambersPlugin.llIlIlIIlIllIl(lllllllllllllllIlllIIIlllIIllIII) || SquireChambersPlugin.llIlIlIIlIIlll(lllllllllllllllIlllIIIlllIIllIII.length)) {
            return;
        }
        String lllllllllllllllIlllIIIlllIIlIlll = Joiner.on((String)lIlIIIIIllll[lIlIIIIlIIII[19]]).join(Arrays.stream(lllllllllllllllIlllIIIlllIIllIII).map(layoutRoom -> c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.N.valueOf(layoutRoom.name())).filter(n2 -> {
            boolean bl2;
            if (!SquireChambersPlugin.llIlIlIIlIlllI((Object)n2.bY(), (Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.P.COMBAT) || SquireChambersPlugin.llIlIlIIlIlIIl((Object)n2.bY(), (Object)c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.P.PUZZLE)) {
                bl2 = lIlIIIIlIIII[3];
                0;
                if (null != null) {
                    return ((0x7D ^ 0x59) & ~(0x8B ^ 0xAF)) != 0;
                }
            } else {
                bl2 = lIlIIIIlIIII[0];
            }
            return bl2;
        }).map(N::bX).toArray());
        if (SquireChambersPlugin.llIlIlIIlIllll(lllllllllllllllIlllIIIlllIIlIlll.length(), lIlIIIIlIIII[65])) {
            z.debug(lIlIIIIIllll[lIlIIIIlIIII[20]], (Object)lllllllllllllllIlllIIIlllIIlIlll.length());
            return;
        }
        String string3 = new ChatMessageBuilder().append(ChatColorType.HIGHLIGHT).append(lIlIIIIIllll[lIlIIIIlIIII[21]]).append(ChatColorType.NORMAL).append((String)var6_7).build();
        z.debug(lIlIIIIIllll[lIlIIIIlIIII[22]], (Object)string3);
        MessageNode messageNode = chatMessage.getMessageNode();
        messageNode.setRuneLiteFormatMessage(string3);
        this.u.refreshChat();
    }

    private static boolean llIlIlIIllIIIl(int n2, int n3) {
        return n2 <= n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ConfigChanged configChanged) {
        void lllllllllllllllIlllIIIlllllllIIl;
        if (SquireChambersPlugin.llIlIlIIlIIlll(configChanged.getGroup().equals(lIlIIIIIllll[lIlIIIIlIIII[5]]) ? 1 : 0)) {
            return;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(lllllllllllllllIlllIIIlllllllIIl.getKey().equals(lIlIIIIIllll[lIlIIIIlIIII[6]]) ? 1 : 0)) {
            SquireChambersPlugin lllllllllllllllIlllIIIlllllllIlI;
            lllllllllllllllIlllIIIlllllllIlI.u();
            return;
        }
    }

    private static boolean llIlIlIIlIllIl(Object object) {
        return object != null;
    }

    void b(a a2) {
        this.aa = a2;
    }

    public n L() {
        return this.ak;
    }

    public List<n> D() {
        return this.ab;
    }

    private static String llIlIlIIlIIIll(String lllllllllllllllIlllIIIllIlIlllIl, String lllllllllllllllIlllIIIllIlIlllII) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIllIllIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIllIlIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            Cipher lllllllllllllllIlllIIIllIllIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllllIlllIIIllIllIIIIl.init(lIlIIIIlIIII[4], lllllllllllllllIlllIIIllIllIIIlI);
            return new String(lllllllllllllllIlllIIIllIllIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIllIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIIllIllIIIII) {
            lllllllllllllllIlllIIIllIllIIIII.printStackTrace();
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public int r() {
        void lllllllllllllllIlllIIIllllllIlIl;
        SquireChambersPlugin lllllllllllllllIlllIIIllllllIllI;
        int n2 = lIlIIIIlIIII[0];
        if (SquireChambersPlugin.llIlIlIIlIIllI(this.k.enableGuardians() ? 1 : 0)) {
            ++n2;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(lllllllllllllllIlllIIIllllllIllI.k.enableTekton() ? 1 : 0)) {
            ++lllllllllllllllIlllIIIllllllIlIl;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(lllllllllllllllIlllIIIllllllIllI.k.enableMuttadiles() ? 1 : 0)) {
            ++lllllllllllllllIlllIIIllllllIlIl;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(lllllllllllllllIlllIIIllllllIllI.k.enableVasa() ? 1 : 0)) {
            ++lllllllllllllllIlllIIIllllllIlIl;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(lllllllllllllllIlllIIIllllllIllI.k.enableVespula() ? 1 : 0)) {
            ++lllllllllllllllIlllIIIllllllIlIl;
        }
        return n2;
    }

    private static boolean llIlIlIIlIIllI(int n2) {
        return n2 != 0;
    }

    public EquipmentSetup R() {
        return this.aq;
    }

    @Provides
    SquireChambersConfig a(ConfigManager configManager) {
        return (SquireChambersConfig)configManager.getConfig(SquireChambersConfig.class);
    }

    /*
     * WARNING - void declaration
     */
    private Point v() {
        Tile[][] tileArray = this.u.getScene().getTiles()[lIlIIIIlIIII[5]];
        int lllllllllllllllIlllIIIllllIIIlII = lIlIIIIlIIII[0];
        while (SquireChambersPlugin.llIlIlIIlIlIII(lllllllllllllllIlllIIIllllIIIlII, lIlIIIIlIIII[62])) {
            int lllllllllllllllIlllIIIllllIIIIll = lIlIIIIlIIII[0];
            while (SquireChambersPlugin.llIlIlIIlIlIII(lllllllllllllllIlllIIIllllIIIIll, lIlIIIIlIIII[62])) {
                void lllllllllllllllIlllIIIllllIIIlIl;
                if (SquireChambersPlugin.llIlIlIIlIllIl(lllllllllllllllIlllIIIllllIIIlIl[lllllllllllllllIlllIIIllllIIIlII][lllllllllllllllIlllIIIllllIIIIll])) {
                    if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIllllIIIlIl[lllllllllllllllIlllIIIllllIIIlII][lllllllllllllllIlllIIIllllIIIIll].getWallObject())) {
                        0;
                        if ((106 + 61 - 57 + 86 ^ 87 + 117 - 35 + 24) == 0) {
                            return null;
                        }
                    } else if (SquireChambersPlugin.llIlIlIIlIlIlI(lllllllllllllllIlllIIIllllIIIlIl[lllllllllllllllIlllIIIllllIIIlII][lllllllllllllllIlllIIIllllIIIIll].getWallObject().getId(), lIlIIIIlIIII[63])) {
                        return lllllllllllllllIlllIIIllllIIIlIl[lllllllllllllllIlllIIIllllIIIlII][lllllllllllllllIlllIIIllllIIIIll].getSceneLocation();
                    }
                }
                ++lllllllllllllllIlllIIIllllIIIIll;
                0;
                if ((1 & (1 ^ -1)) == ((113 + 214 - 230 + 149 ^ 38 + 133 - 166 + 182) & (240 + 96 - 197 + 113 ^ 59 + 58 - 26 + 86 ^ -1))) continue;
                return null;
            }
            ++lllllllllllllllIlllIIIllllIIIlII;
            0;
            if (-1 < 3) continue;
            return null;
        }
        return null;
    }

    public h B() {
        return this.Y;
    }

    protected Class<?>[] tasks() {
        Class[] classArray = new Class[lIlIIIIlIIII[2]];
        classArray[SquireChambersPlugin.lIlIIIIlIIII[0]] = aX.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[3]] = aW.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[4]] = aV.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[5]] = aU.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[6]] = aT.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[7]] = bk.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[8]] = bl.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[9]] = bj.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[10]] = bi.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[11]] = aK.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[12]] = aN.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[13]] = aO.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[14]] = aS.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[15]] = aJ.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[16]] = aP.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[17]] = aQ.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[18]] = aL.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[19]] = aI.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[20]] = aM.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[21]] = bb.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[22]] = bf.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[23]] = bc.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[24]] = aY.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[25]] = be.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[26]] = bd.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[27]] = aZ.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[28]] = bh.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[29]] = ba.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[30]] = aA.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[31]] = aB.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[32]] = aE.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[33]] = aC.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[34]] = aD.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[35]] = aF.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[36]] = aH.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[37]] = V.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[38]] = W.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[39]] = T.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[40]] = aw.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[41]] = ax.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[42]] = av.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[43]] = ay.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[44]] = aa.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[45]] = au.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[46]] = Z.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[47]] = X.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[48]] = af.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[49]] = ae.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[50]] = ac.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[51]] = ab.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[1]] = ak.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[52]] = ad.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[53]] = aj.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[54]] = ai.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[55]] = ah.class;
        classArray[SquireChambersPlugin.lIlIIIIlIIII[56]] = ag.class;
        return classArray;
    }

    private static String llIlIlIIlIIIIl(String lllllllllllllllIlllIIIllIIlllIlI, String lllllllllllllllIlllIIIllIIlllIIl) {
        try {
            SecretKeySpec lllllllllllllllIlllIIIllIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllllIlllIIIllIIlllIIl.getBytes(StandardCharsets.UTF_8)), lIlIIIIlIIII[10]), "DES");
            Cipher lllllllllllllllIlllIIIllIIllllII = Cipher.getInstance("DES");
            lllllllllllllllIlllIIIllIIllllII.init(lIlIIIIlIIII[4], lllllllllllllllIlllIIIllIIllllIl);
            return new String(lllllllllllllllIlllIIIllIIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllllIlllIIIllIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllllIlllIIIllIIlllIll) {
            lllllllllllllllIlllIIIllIIlllIll.printStackTrace();
            return null;
        }
    }

    public SquireChambersPlugin() {
        this.ab = new ArrayList<n>();
        this.ag = lIlIIIIlIIII[0];
        this.ah = lIlIIIIlIIII[1];
        this.ai = lIlIIIIlIIII[0];
        this.aj = lIlIIIIlIIII[0];
        this.an = null;
        this.ao = null;
        this.ap = null;
        this.aq = null;
    }

    private static void llIlIlIIlIIlII() {
        lIlIIIIIllll = new String[lIlIIIIlIIII[36]];
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[0]] = SquireChambersPlugin."Not enough Combat Rooms selected, please select more Combat Rooms";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[3]] = SquireChambersPlugin."Not enough Puzzle Rooms selected, please select more Puzzle Rooms";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[4]] = SquireChambersPlugin."Guardians rooms is enabled but no pickaxe found in Bank Loadout";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[5]] = SquireChambersPlugin."squireraids";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[6]] = SquireChambersPlugin."raidsTimer";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[7]] = SquireChambersPlugin."deposited grubs";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[8]] = SquireChambersPlugin."deposited grubs";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[9]] = SquireChambersPlugin."Raid party has been dissolved";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[10]] = SquireChambersPlugin."IN RAID CHANGED";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[11]] = SquireChambersPlugin."Scouting raid";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[12]] = SquireChambersPlugin."Raid has ended";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[13]] = SquireChambersPlugin."level complete!";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[14]] = SquireChambersPlugin."Congratulations - your raid is complete!";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[15]] = SquireChambersPlugin."Failed to build raid";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[16]] = SquireChambersPlugin."Could not find layout match";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[17]] = SquireChambersPlugin."Scouting for raid";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[18]] = SquireChambersPlugin."unable to lookup layout";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[19]] = SquireChambersPlugin.", ";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[20]] = SquireChambersPlugin."layout message too long! {}";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[21]] = SquireChambersPlugin."Layout: ";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[22]] = SquireChambersPlugin."Setting response {}";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[23]] = SquireChambersPlugin."Eat";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[24]] = SquireChambersPlugin."Chambers";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[25]] = SquireChambersPlugin."Tekton";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[26]] = SquireChambersPlugin."Revitalisation";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[27]] = SquireChambersPlugin."Super restore";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[28]] = SquireChambersPlugin."Xeric's";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[29]] = SquireChambersPlugin."Saradomin brew";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[30]] = SquireChambersPlugin."unable to submit layout";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[31]] = SquireChambersPlugin."pickaxe";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[32]] = SquireChambersPlugin."Congratulations - your raid is complete!";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[33]] = SquireChambersPlugin."level complete!";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[34]] = SquireChambersPlugin."###.##";
        SquireChambersPlugin.lIlIIIIIllll[SquireChambersPlugin.lIlIIIIlIIII[35]] = SquireChambersPlugin."#,###";
    }

    public void a(n n2) {
        this.ak = n2;
    }

    private static String llIlIlIIlIIIlI(String lllllllllllllllIlllIIIllIlIIllll, String lllllllllllllllIlllIIIllIlIIlIIl) {
        lllllllllllllllIlllIIIllIlIIllll = new String(Base64.getDecoder().decode(lllllllllllllllIlllIIIllIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        StringBuilder lllllllllllllllIlllIIIllIlIIllIl = new StringBuilder();
        char[] lllllllllllllllIlllIIIllIlIIllII = lllllllllllllllIlllIIIllIlIIlIIl.toCharArray();
        int lllllllllllllllIlllIIIllIlIIlIll = lIlIIIIlIIII[0];
        char[] lllllllllllllllIlllIIIllIlIIIlIl = lllllllllllllllIlllIIIllIlIIllll.toCharArray();
        int lllllllllllllllIlllIIIllIlIIIlII = lllllllllllllllIlllIIIllIlIIIlIl.length;
        int lllllllllllllllIlllIIIllIlIIIIll = lIlIIIIlIIII[0];
        while (SquireChambersPlugin.llIlIlIIlIlIII(lllllllllllllllIlllIIIllIlIIIIll, lllllllllllllllIlllIIIllIlIIIlII)) {
            char lllllllllllllllIlllIIIllIlIlIIII = lllllllllllllllIlllIIIllIlIIIlIl[lllllllllllllllIlllIIIllIlIIIIll];
            lllllllllllllllIlllIIIllIlIIllIl.append((char)(lllllllllllllllIlllIIIllIlIlIIII ^ lllllllllllllllIlllIIIllIlIIllII[lllllllllllllllIlllIIIllIlIIlIll % lllllllllllllllIlllIIIllIlIIllII.length]));
            0;
            ++lllllllllllllllIlllIIIllIlIIlIll;
            ++lllllllllllllllIlllIIIllIlIIIIll;
            0;
            if (-3 <= 0) continue;
            return null;
        }
        return String.valueOf(lllllllllllllllIlllIIIllIlIIllIl);
    }

    public int J() {
        return this.ai;
    }

    public void b(EquipmentSetup equipmentSetup) {
        this.ao = equipmentSetup;
    }

    public void configure(Binder binder) {
        binder.bind(d.class);
        0;
    }

    public a C() {
        return this.aa;
    }

    /*
     * WARNING - void declaration
     */
    public int s() {
        void lllllllllllllllIlllIIIllllllIIIl;
        SquireChambersPlugin lllllllllllllllIlllIIIllllllIIlI;
        int n2 = lIlIIIIlIIII[0];
        if (SquireChambersPlugin.llIlIlIIlIIllI(this.k.enableCrabs() ? 1 : 0)) {
            ++n2;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(lllllllllllllllIlllIIIllllllIIlI.k.enableThieving() ? 1 : 0)) {
            ++lllllllllllllllIlllIIIllllllIIIl;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(lllllllllllllllIlllIIIllllllIIlI.k.enableIceDemon() ? 1 : 0)) {
            ++lllllllllllllllIlllIIIllllllIIIl;
        }
        if (SquireChambersPlugin.llIlIlIIlIIllI(lllllllllllllllIlllIIIllllllIIlI.k.enableTightrope() ? 1 : 0)) {
            ++lllllllllllllllIlllIIIllllllIIIl;
        }
        return n2;
    }

    @Subscribe
    public void a(LootReceived lootReceived) {
        if (SquireChambersPlugin.llIlIlIIlIIlll(lootReceived.getName().contains(lIlIIIIIllll[lIlIIIIlIIII[24]]) ? 1 : 0) && SquireChambersPlugin.llIlIlIIlIIlll(lootReceived.getName().contains(lIlIIIIIllll[lIlIIIIlIIII[25]]) ? 1 : 0)) {
            return;
        }
        Collection collection = lootReceived.getItems();
        ItemStack itemStack2 = collection.stream().filter(itemStack -> J.contains(itemStack.getId())).findFirst().orElse(null);
        c.s.r.c.-.u.i.s.q.e.r.b.h.e.m.a.i.r.e.-.f.x.-.o.al.a(itemStack2, collection, this.k.anonymize());
    }

    private static boolean llIlIlIIllIIII(int n2, int n3) {
        return n2 >= n3;
    }

    public int I() {
        return this.ah;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(ChatMessage chatMessage) {
        if (SquireChambersPlugin.llIlIlIIlIIllI(this.ac ? 1 : 0) && SquireChambersPlugin.llIlIlIIlIlIIl(chatMessage.getType(), ChatMessageType.FRIENDSCHATNOTIFICATION)) {
            SquireChambersPlugin lllllllllllllllIlllIIIllllIllIIl;
            void lllllllllllllllIlllIIIllllIlIlll;
            String string = Text.removeTags((String)chatMessage.getMessage());
            if (SquireChambersPlugin.llIlIlIIlIllIl((Object)this.ae) && SquireChambersPlugin.llIlIlIIlIIllI(string.contains(lIlIIIIIllll[lIlIIIIlIIII[13]]) ? 1 : 0)) {
                this.ae.n();
            }
            if (SquireChambersPlugin.llIlIlIIlIIllI(lllllllllllllllIlllIIIllllIlIlll.startsWith(lIlIIIIIllll[lIlIIIIlIIII[14]]) ? 1 : 0) && SquireChambersPlugin.llIlIlIIlIllIl((Object)lllllllllllllllIlllIIIllllIllIIl.ae)) {
                lllllllllllllllIlllIIIllllIllIIl.ae.o();
                lllllllllllllllIlllIIIllllIllIIl.ae.a(lIlIIIIlIIII[3]);
            }
        }
    }

    static {
        SquireChambersPlugin.llIlIlIIlIIlIl();
        SquireChambersPlugin.llIlIlIIlIIlII();
        F = lIlIIIIIllll[lIlIIIIlIIII[32]];
        D = lIlIIIIlIIII[6];
        E = lIlIIIIIllll[lIlIIIIlIIII[33]];
        B = lIlIIIIlIIII[4];
        I = lIlIIIIlIIII[65];
        A = lIlIIIIlIIII[5];
        C = lIlIIIIlIIII[10];
        z = LoggerFactory.getLogger(SquireChambersPlugin.class);
        G = new DecimalFormat(lIlIIIIIllll[lIlIIIIlIIII[34]]);
        H = new DecimalFormat(lIlIIIIIllll[lIlIIIIlIIII[35]]);
        Object[] objectArray = new Integer[lIlIIIIlIIII[8]];
        objectArray[SquireChambersPlugin.lIlIIIIlIIII[0]] = lIlIIIIlIIII[73];
        objectArray[SquireChambersPlugin.lIlIIIIlIIII[3]] = lIlIIIIlIIII[74];
        objectArray[SquireChambersPlugin.lIlIIIIlIIII[4]] = lIlIIIIlIIII[75];
        objectArray[SquireChambersPlugin.lIlIIIIlIIII[5]] = lIlIIIIlIIII[76];
        objectArray[SquireChambersPlugin.lIlIIIIlIIII[6]] = lIlIIIIlIIII[77];
        objectArray[SquireChambersPlugin.lIlIIIIlIIII[7]] = lIlIIIIlIIII[78];
        J = ImmutableSet.of((Object)lIlIIIIlIIII[67], (Object)lIlIIIIlIIII[68], (Object)lIlIIIIlIIII[69], (Object)lIlIIIIlIIII[70], (Object)lIlIIIIlIIII[71], (Object)lIlIIIIlIIII[72], (Object[])objectArray);
    }

    public k A() {
        return this.X;
    }

    public int H() {
        return this.ag;
    }

    public void f(int n2) {
        this.ai = n2;
    }

    public void b(boolean bl2) {
        this.af = bl2;
    }

    public void h(int n2) {
        this.am = n2;
    }

    public void a(EquipmentSetup equipmentSetup) {
        this.an = equipmentSetup;
    }

    private static boolean llIlIlIIlIllll(int n2, int n3) {
        return n2 > n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(GameStateChanged gameStateChanged) {
        void lllllllllllllllIlllIIIllllIlIIll;
        SquireChambersPlugin lllllllllllllllIlllIIIllllIlIlII;
        if (!SquireChambersPlugin.llIlIlIIlIlIIl(this.u.getGameState(), GameState.LOGGED_IN) || SquireChambersPlugin.llIlIlIIlIlllI(this.ar, GameState.CONNECTION_LOST)) {
            // empty if block
        }
        if (SquireChambersPlugin.llIlIlIIlIlIIl(lllllllllllllllIlllIIIllllIlIlII.u.getGameState(), GameState.LOGIN_SCREEN)) {
            lllllllllllllllIlllIIIllllIlIlII.b(lIlIIIIlIIII[3]);
        }
        if (SquireChambersPlugin.llIlIlIIlIllIl(lllllllllllllllIlllIIIllllIlIIll)) {
            lllllllllllllllIlllIIIllllIlIlII.ar = lllllllllllllllIlllIIIllllIlIlII.u.getGameState();
        }
    }

    public void d(EquipmentSetup equipmentSetup) {
        this.aq = equipmentSetup;
    }

    private static boolean llIlIlIIlIlIlI(int n2, int n3) {
        return n2 == n3;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe(priority=1000.0f)
    public void a(InventoryChanged inventoryChanged) {
        int n2 = inventoryChanged.getAmount();
        int n3 = inventoryChanged.getItemId();
        if (SquireChambersPlugin.llIlIlIIlIlIIl(inventoryChanged.getChangeType(), InventoryChanged.ChangeType.ITEM_REMOVED)) {
            void lllllllllllllllIlllIIIlllllIIlIl;
            if (SquireChambersPlugin.llIlIlIIlIlIlI(n3, lIlIIIIlIIII[57])) {
                System.out.print(lIlIIIIIllll[lIlIIIIlIIII[7]]);
                this.ai += n2;
            }
            if (SquireChambersPlugin.llIlIlIIlIlIlI((int)lllllllllllllllIlllIIIlllllIIlIl, lIlIIIIlIIII[58])) {
                void lllllllllllllllIlllIIIlllllIIllI;
                System.out.print(lIlIIIIIllll[lIlIIIIlIIII[8]]);
                lllllllllllllllIlllIIIlllllIlIII.aj += lllllllllllllllIlllIIIlllllIIllI;
            }
        }
    }

    private void u() {
        if (SquireChambersPlugin.llIlIlIIlIllIl((Object)this.ae) && SquireChambersPlugin.llIlIlIIlIIlll(this.ac ? 1 : 0)) {
            this.M.removeInfoBox((InfoBox)this.ae);
            this.ae = null;
        }
    }

    public l z() {
        return this.W;
    }

    public EquipmentSetup O() {
        return this.an;
    }

    private void w() {
        this.aa = null;
        this.u();
        this.Z.post((Object)new f());
    }

    private BankLoadout q() {
        return (BankLoadout)this.k.bankLoadout().selected(BankLoadout.class);
    }

    /*
     * WARNING - void declaration
     */
    private Integer a(Point point) {
        void var3_3;
        void var2_4;
        int lllllllllllllllIlllIIIlllIIIIIlI;
        int lllllllllllllllIlllIIIlllIIIIIIl;
        void lllllllllllllllIlllIIIlllIIIIIll;
        SquireChambersPlugin lllllllllllllllIlllIIIlllIIIIlII;
        if (!SquireChambersPlugin.llIlIlIIlIllll(lIlIIIIlIIII[62], point.getX() + lIlIIIIlIIII[34]) || SquireChambersPlugin.llIlIlIIllIIIl(lIlIIIIlIIII[62], point.getY() + lIlIIIIlIIII[34])) {
            return null;
        }
        Tile[][] lllllllllllllllIlllIIIlllIIIIIII = lllllllllllllllIlllIIIlllIIIIlII.u.getScene().getTiles()[lIlIIIIlIIII[5]];
        if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIlllIIIIIII[lllllllllllllllIlllIIIlllIIIIIll.getX()][lllllllllllllllIlllIIIlllIIIIIll.getY() + lIlIIIIlIIII[34]])) {
            lllllllllllllllIlllIIIlllIIIIIIl = lIlIIIIlIIII[0];
            0;
            if (((44 + 79 - 60 + 78 ^ 45 + 59 - 102 + 160) & (0x26 ^ 0x48 ^ (0x74 ^ 0x35) ^ -1)) < 0) {
                return null;
            }
        } else {
            lllllllllllllllIlllIIIlllIIIIIIl = lIlIIIIlIIII[3];
        }
        if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIlllIIIIIII[lllllllllllllllIlllIIIlllIIIIIll.getX() + lIlIIIIlIIII[34]][lllllllllllllllIlllIIIlllIIIIIll.getY()])) {
            lllllllllllllllIlllIIIlllIIIIIlI = lIlIIIIlIIII[5];
            0;
            if (-3 > 0) {
                return null;
            }
        } else {
            int lllllllllllllllIlllIIIllIlllllll;
            lllllllllllllllIlllIIIlllIIIIIlI = lIlIIIIlIIII[0];
            while (SquireChambersPlugin.llIlIlIIlIlIII(lllllllllllllllIlllIIIlllIIIIIlI, lIlIIIIlIIII[5]) && SquireChambersPlugin.llIlIlIIllIIlI(lllllllllllllllIlllIIIllIlllllll = lllllllllllllllIlllIIIlllIIIIIll.getX() - lIlIIIIlIIII[3] - lIlIIIIlIIII[34] * lllllllllllllllIlllIIIlllIIIIIlI)) {
                if (SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIlllIIIIIII[lllllllllllllllIlllIIIllIlllllll][lllllllllllllllIlllIIIlllIIIIIll.getY()])) {
                    0;
                    if (-1 < 3) break;
                    return null;
                }
                ++lllllllllllllllIlllIIIlllIIIIIlI;
                0;
                if (null == null) continue;
                return null;
            }
        }
        return (int)(var2_4 + var3_3 * lIlIIIIlIIII[6]);
    }

    public int F() {
        return this.ad;
    }

    private static boolean llIlIlIIllIIlI(int n2) {
        return n2 >= 0;
    }

    public boolean E() {
        return this.ac;
    }

    /*
     * WARNING - void declaration
     */
    @Subscribe
    public void a(VarbitChanged varbitChanged) {
        void lllllllllllllllIlllIIIllllIlllll;
        SquireChambersPlugin lllllllllllllllIlllIIIlllllIIIII;
        if (SquireChambersPlugin.llIlIlIIlIlIlI(varbitChanged.getVarpId(), lIlIIIIlIIII[59])) {
            int n2 = this.ac;
            int n3 = this.ad;
            this.ad = varbitChanged.getValue();
            if (SquireChambersPlugin.llIlIlIIlIlIIl(this.u.getGameState(), GameState.LOGGED_IN) && (!SquireChambersPlugin.llIlIlIIlIIllI(n2) || SquireChambersPlugin.llIlIlIIlIlIll(n3, lIlIIIIlIIII[60]) && SquireChambersPlugin.llIlIlIIlIlIll(this.ad, lIlIIIIlIIII[60]) && SquireChambersPlugin.llIlIlIIlIlIll(n3, this.ad))) {
                z.debug(lIlIIIIIllll[lIlIIIIlIIII[9]]);
                lllllllllllllllIlllIIIlllllIIIII.w();
            }
        }
        if (SquireChambersPlugin.llIlIlIIlIlIlI(lllllllllllllllIlllIIIllllIlllll.getVarbitId(), lIlIIIIlIIII[61])) {
            int n4;
            System.out.println(lIlIIIIIllll[lIlIIIIlIIII[10]]);
            if (SquireChambersPlugin.llIlIlIIlIlIlI(lllllllllllllllIlllIIIllllIlllll.getValue(), lIlIIIIlIIII[3])) {
                n4 = lIlIIIIlIIII[3];
                0;
                if (-3 > 0) {
                    return;
                }
            } else {
                n4 = lIlIIIIlIIII[0];
            }
            int n5 = n4;
            lllllllllllllllIlllIIIlllllIIIII.ac = n5;
            if (SquireChambersPlugin.llIlIlIIlIlIIl(lllllllllllllllIlllIIIlllllIIIII.u.getGameState(), GameState.LOGGED_IN)) {
                if (SquireChambersPlugin.llIlIlIIlIIllI(n5) && SquireChambersPlugin.llIlIlIIlIllII(lllllllllllllllIlllIIIlllllIIIII.aa)) {
                    System.out.println(lIlIIIIIllll[lIlIIIIlIIII[11]]);
                    lllllllllllllllIlllIIIlllllIIIII.t();
                    0;
                    if ((9 ^ 0xC) <= 0) {
                        return;
                    }
                } else if (SquireChambersPlugin.llIlIlIIlIlIlI(lllllllllllllllIlllIIIlllllIIIII.ad, lIlIIIIlIIII[60])) {
                    z.debug(lIlIIIIIllll[lIlIIIIlIIII[12]]);
                    lllllllllllllllIlllIIIlllllIIIII.w();
                }
            }
        }
    }

    public EquipmentSetup Q() {
        return this.ap;
    }

    private static boolean llIlIlIIlIlIII(int n2, int n3) {
        return n2 < n3;
    }
}

