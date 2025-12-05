/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.inject.Inject
 *  javax.inject.Singleton
 *  net.runelite.api.Client
 *  net.runelite.api.EquipmentInventorySlot
 *  net.runelite.api.InventoryID
 *  net.runelite.api.Item
 *  net.runelite.api.ItemContainer
 *  net.runelite.api.Skill
 *  net.runelite.api.events.ScriptPreFired
 *  net.runelite.api.widgets.Widget
 *  net.runelite.api.widgets.WidgetUtil
 */
package net.runelite.client.plugins.wiki;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Singleton;
import net.runelite.api.Client;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.api.InventoryID;
import net.runelite.api.Item;
import net.runelite.api.ItemContainer;
import net.runelite.api.Skill;
import net.runelite.api.events.ScriptPreFired;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetUtil;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.util.LinkBrowser;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Singleton
class WikiDpsManager {
    private static final Logger log = LoggerFactory.getLogger(WikiDpsManager.class);
    private static final int[] SPRITE_IDS_INACTIVE = new int[]{1040, 929, 930, 931, 932, 933, 934, 935, 936};
    private static final int[] SPRITE_IDS_ACTIVE = new int[]{897, 921, 922, 923, 924, 925, 926, 927, 928};
    private static final int FONT_COLOUR_INACTIVE = 16750623;
    private static final int FONT_COLOUR_ACTIVE = 0xFFFFFF;
    private static final String UI_ENDPOINT = "https://tools.runescape.wiki/osrs-dps/";
    private static final String SHORTLINK_ENDPOINT = "https://tools.runescape.wiki/osrs-dps/shortlink";
    private final Client client;
    private final ClientThread clientThread;
    private final EventBus eventBus;
    private final OkHttpClient okHttpClient;
    private final Gson gson;

    @Inject
    private WikiDpsManager(Client client, ClientThread clientThread, EventBus eventBus, OkHttpClient okHttpClient, Gson gson) {
        this.client = client;
        this.clientThread = clientThread;
        this.eventBus = eventBus;
        this.okHttpClient = okHttpClient;
        this.gson = gson;
    }

    public void startUp() {
        this.eventBus.register(this);
        this.clientThread.invokeLater(() -> this.tryAddButton(this::launch));
    }

    public void shutDown() {
        this.eventBus.unregister(this);
        this.clientThread.invokeLater(this::removeButton);
    }

    @Subscribe
    public void onScriptPreFired(ScriptPreFired scriptPreFired) {
        if (scriptPreFired.getScriptId() == 3517) {
            boolean setBonus;
            int interfaceId = WidgetUtil.componentToInterface((int)((Integer)scriptPreFired.getScriptEvent().getArguments()[1]));
            boolean bl = setBonus = (Integer)scriptPreFired.getScriptEvent().getArguments()[4] == 1;
            if (!setBonus) {
                if (interfaceId == 12) {
                    this.clientThread.invokeLater(() -> this.addButton(Screen.BANK_EQUIPMENT, this::launch));
                } else if (interfaceId == 84) {
                    this.addButton(Screen.EQUIPMENT_BONUSES, this::launch);
                }
            }
        }
    }

    void tryAddButton(Runnable onClick) {
        for (Screen screen : Screen.values()) {
            this.addButton(screen, onClick);
        }
    }

    void addButton(Screen screen, Runnable onClick) {
        Widget[] refComponents;
        Widget parent = this.client.getWidget(screen.getParentId());
        Widget setBonus = this.client.getWidget(screen.getSetBonusId());
        Widget statBonus = this.client.getWidget(screen.getStatBonusId());
        if (parent == null || setBonus == null || statBonus == null || (refComponents = setBonus.getChildren()) == null) {
            return;
        }
        int padding = 8;
        int w = setBonus.getOriginalWidth();
        int h = setBonus.getOriginalHeight();
        int x = setBonus.getOriginalX() + w / 2 + padding / 2;
        int y = setBonus.getOriginalY();
        if (screen == Screen.BANK_EQUIPMENT) {
            y += parent.getHeight() / 2 - setBonus.getHeight() / 2;
        }
        setBonus.setOriginalX(setBonus.getOriginalX() - w / 2 - padding / 2).revalidate();
        statBonus.setOriginalX(statBonus.getOriginalX() - w / 2 - padding / 2).revalidate();
        Widget[] spriteWidgets = new Widget[9];
        int bgWidth = w - refComponents[0].getOriginalWidth();
        int bgHeight = h - refComponents[0].getOriginalHeight();
        int bgX = x + refComponents[0].getOriginalX() + (w - bgWidth) / 2;
        int bgY = y + refComponents[0].getOriginalY() + (h - bgHeight) / 2;
        spriteWidgets[0] = parent.createChild(-1, 5).setSpriteId(refComponents[0].getSpriteId()).setPos(bgX, bgY).setSize(bgWidth, bgHeight);
        spriteWidgets[0].revalidate();
        for (int i = 1; i < 9; ++i) {
            spriteWidgets[i] = parent.createChild(-1, 5).setSpriteId(refComponents[i].getSpriteId()).setPos(x + refComponents[i].getOriginalX(), y + refComponents[i].getOriginalY()).setSize(refComponents[i].getOriginalWidth(), refComponents[i].getOriginalHeight());
            spriteWidgets[i].revalidate();
        }
        Widget text = parent.createChild(-1, 4).setText("View DPS").setTextColor(16750623).setFontId(refComponents[9].getFontId()).setTextShadowed(refComponents[9].getTextShadowed()).setXTextAlignment(refComponents[9].getXTextAlignment()).setYTextAlignment(refComponents[9].getYTextAlignment()).setPos(x, y).setSize(w, h);
        text.revalidate();
        text.setHasListener(true);
        text.setOnMouseOverListener(new Object[]{ev -> {
            for (int i = 0; i <= 8; ++i) {
                spriteWidgets[i].setSpriteId(SPRITE_IDS_ACTIVE[i]);
            }
            text.setTextColor(0xFFFFFF);
        }});
        text.setOnMouseLeaveListener(new Object[]{ev -> {
            for (int i = 0; i <= 8; ++i) {
                spriteWidgets[i].setSpriteId(SPRITE_IDS_INACTIVE[i]);
            }
            text.setTextColor(16750623);
        }});
        text.setAction(0, "View DPS on OSRS Wiki");
        text.setOnOpListener(new Object[]{ev -> onClick.run()});
        parent.revalidate();
    }

    void removeButton() {
        for (Screen screen : Screen.values()) {
            Widget statBonus;
            Widget setBonus;
            Widget parent = this.client.getWidget(screen.getParentId());
            if (parent != null) {
                parent.deleteAllChildren();
                parent.revalidate();
            }
            if ((setBonus = this.client.getWidget(screen.getSetBonusId())) != null) {
                setBonus.setOriginalX(screen.getOriginalX()).revalidate();
            }
            if ((statBonus = this.client.getWidget(screen.getStatBonusId())) == null) continue;
            statBonus.setOriginalX(screen.getOriginalX()).revalidate();
        }
    }

    @Nullable
    private JsonObject createEquipmentObject(ItemContainer itemContainer, EquipmentInventorySlot slot) {
        if (itemContainer == null) {
            return null;
        }
        if (slot == EquipmentInventorySlot.BOOTS && itemContainer.count() == 1 && itemContainer.contains(1949)) {
            JsonObject o = new JsonObject();
            o.addProperty("id", 7800);
            return o;
        }
        Item item = itemContainer.getItem(slot.getSlotIdx());
        if (item != null) {
            JsonObject o = new JsonObject();
            o.addProperty("id", item.getId());
            return o;
        }
        return null;
    }

    private JsonObject buildShortlinkData() {
        JsonObject j = new JsonObject();
        JsonArray loadouts = new JsonArray();
        ItemContainer eqContainer = this.client.getItemContainer(InventoryID.EQUIPMENT);
        JsonObject l = new JsonObject();
        JsonObject eq = new JsonObject();
        eq.add("ammo", this.createEquipmentObject(eqContainer, EquipmentInventorySlot.AMMO));
        eq.add("body", this.createEquipmentObject(eqContainer, EquipmentInventorySlot.BODY));
        eq.add("cape", this.createEquipmentObject(eqContainer, EquipmentInventorySlot.CAPE));
        eq.add("feet", this.createEquipmentObject(eqContainer, EquipmentInventorySlot.BOOTS));
        eq.add("hands", this.createEquipmentObject(eqContainer, EquipmentInventorySlot.GLOVES));
        eq.add("head", this.createEquipmentObject(eqContainer, EquipmentInventorySlot.HEAD));
        eq.add("legs", this.createEquipmentObject(eqContainer, EquipmentInventorySlot.LEGS));
        eq.add("neck", this.createEquipmentObject(eqContainer, EquipmentInventorySlot.AMULET));
        eq.add("ring", this.createEquipmentObject(eqContainer, EquipmentInventorySlot.RING));
        eq.add("shield", this.createEquipmentObject(eqContainer, EquipmentInventorySlot.SHIELD));
        eq.add("weapon", this.createEquipmentObject(eqContainer, EquipmentInventorySlot.WEAPON));
        l.add("equipment", eq);
        JsonObject skills = new JsonObject();
        skills.addProperty("atk", this.client.getRealSkillLevel(Skill.ATTACK));
        skills.addProperty("def", this.client.getRealSkillLevel(Skill.DEFENCE));
        skills.addProperty("hp", this.client.getRealSkillLevel(Skill.HITPOINTS));
        skills.addProperty("magic", this.client.getRealSkillLevel(Skill.MAGIC));
        skills.addProperty("mining", this.client.getRealSkillLevel(Skill.MINING));
        skills.addProperty("prayer", this.client.getRealSkillLevel(Skill.PRAYER));
        skills.addProperty("ranged", this.client.getRealSkillLevel(Skill.RANGED));
        skills.addProperty("str", this.client.getRealSkillLevel(Skill.STRENGTH));
        l.add("skills", skills);
        JsonObject buffs = new JsonObject();
        buffs.addProperty("inWilderness", this.client.getVarbitValue(5963) == 1);
        buffs.addProperty("kandarinDiary", this.client.getVarbitValue(4477) == 1);
        buffs.addProperty("onSlayerTask", this.client.getVarpValue(394) > 0);
        buffs.addProperty("chargeSpell", this.client.getVarpValue(272) > 0);
        l.add("buffs", buffs);
        l.addProperty("name", this.client.getLocalPlayer().getName());
        loadouts.add(l);
        j.add("loadouts", loadouts);
        return j;
    }

    void launch() {
        JsonObject jsonBody = this.buildShortlinkData();
        Request request = new Request.Builder().url(SHORTLINK_ENDPOINT).post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), jsonBody.toString())).build();
        this.okHttpClient.newCall(request).enqueue(new Callback(){

            @Override
            public void onFailure(Call call, IOException e) {
                log.warn("Failed to create shortlink for DPS calculator", e);
            }

            @Override
            public void onResponse(Call call, Response response) {
                try (Response response2 = response;){
                    if (response.isSuccessful() && response.body() != null) {
                        ShortlinkResponse resp = WikiDpsManager.this.gson.fromJson(response.body().charStream(), ShortlinkResponse.class);
                        LinkBrowser.browse("https://tools.runescape.wiki/osrs-dps/?id=" + resp.data);
                    } else {
                        log.warn("Failed to create shortlink for DPS calculator: http status {}", (Object)response.code());
                    }
                }
            }
        });
    }

    private static class ShortlinkResponse {
        String data;

        private ShortlinkResponse() {
        }
    }

    static enum Screen {
        EQUIPMENT_BONUSES(5505025, 5505068, 5505073, 55),
        BANK_EQUIPMENT(786512, 786553, 786566, 49);

        private final int parentId;
        private final int setBonusId;
        private final int statBonusId;
        private final int originalX;

        public int getOriginalX() {
            return this.originalX;
        }

        private Screen(int parentId, int setBonusId, int statBonusId, int originalX) {
            this.parentId = parentId;
            this.setBonusId = setBonusId;
            this.statBonusId = statBonusId;
            this.originalX = originalX;
        }

        public int getParentId() {
            return this.parentId;
        }

        public int getSetBonusId() {
            return this.setBonusId;
        }

        public int getStatBonusId() {
            return this.statBonusId;
        }
    }
}

