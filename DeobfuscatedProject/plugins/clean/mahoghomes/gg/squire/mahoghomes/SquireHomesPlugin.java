/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.inject.Provides
 *  gg.squire.api.InventorySetup
 *  gg.squire.client.plugins.SquirePlugin
 *  gg.squire.client.plugins.SquireUtil
 *  javax.inject.Inject
 *  net.runelite.api.ChatMessageType
 *  net.runelite.api.GameState
 *  net.runelite.api.events.ChatMessage
 *  net.runelite.api.events.VarbitChanged
 *  net.runelite.api.events.WidgetLoaded
 *  net.runelite.api.util.Text
 *  net.runelite.client.config.ConfigManager
 *  net.runelite.client.eventbus.EventBus
 *  net.runelite.client.eventbus.Subscribe
 *  net.runelite.client.plugins.PluginDescriptor
 *  net.runelite.client.ui.overlay.Overlay
 *  net.runelite.client.ui.overlay.OverlayManager
 *  net.runelite.client.util.Text
 *  net.unethicalite.api.items.Bank
 *  net.unethicalite.api.items.Inventory
 *  net.unethicalite.client.Static
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package gg.squire.mahoghomes;

import com.google.inject.Provides;
import gg.squire.api.InventorySetup;
import gg.squire.client.plugins.SquirePlugin;
import gg.squire.client.plugins.SquireUtil;
import gg.squire.mahoghomes.SquireHomesConfig;
import gg.squire.mahoghomes.model.Contract;
import gg.squire.mahoghomes.model.Home;
import gg.squire.mahoghomes.model.Hotspot;
import gg.squire.mahoghomes.model.PlankSack;
import gg.squire.mahoghomes.model.RequiredMaterials;
import gg.squire.mahoghomes.overlay.HomesInfoBox;
import gg.squire.mahoghomes.tasks.BankTask;
import gg.squire.mahoghomes.tasks.CheckSack;
import gg.squire.mahoghomes.tasks.CompleteTask;
import gg.squire.mahoghomes.tasks.DialogSpacebar;
import gg.squire.mahoghomes.tasks.EmptySack;
import gg.squire.mahoghomes.tasks.GetAssignment;
import gg.squire.mahoghomes.tasks.HandleStairs;
import gg.squire.mahoghomes.tasks.TravelToHouse;
import gg.squire.mahoghomes.tasks.furniture.CreationMenuTask;
import gg.squire.mahoghomes.tasks.furniture.FurnitureTask;
import java.time.Instant;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import javax.inject.Inject;
import net.runelite.api.ChatMessageType;
import net.runelite.api.GameState;
import net.runelite.api.events.ChatMessage;
import net.runelite.api.events.VarbitChanged;
import net.runelite.api.events.WidgetLoaded;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.EventBus;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.overlay.Overlay;
import net.runelite.client.ui.overlay.OverlayManager;
import net.runelite.client.util.Text;
import net.unethicalite.api.items.Bank;
import net.unethicalite.api.items.Inventory;
import net.unethicalite.client.Static;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@PluginDescriptor(name="Squire Mahogany Homes", enabledByDefault=false)
@SquireUtil
public class SquireHomesPlugin
extends SquirePlugin {
    private static final Logger log = LoggerFactory.getLogger(SquireHomesPlugin.class);
    private static final Pattern CONTRACT_PATTERN = Pattern.compile("(Please could you g|G)o see (\\w*)[ ,][\\w\\s,-]*[?.] You can get another job once you have furnished \\w* home\\.");
    private static final Pattern CONTRACT_CHAT_MESSAGE = Pattern.compile("\"(?<rank>\\\\w+) Contract: Go see (?<npc>\\\\w+), (?<location>.+)\"");
    private static final Pattern REMINDER_PATTERN = Pattern.compile("You're currently on an? (\\w*) Contract\\. Go see (\\w*)[ ,][\\w\\s,-]*\\. You can get another job once you have furnished \\w* home\\.");
    private static final Pattern CONTRACT_FINISHED = Pattern.compile("You have completed [\\d,]* contract(s)? with a total of [\\d,]* points?\\.");
    private static final RequiredMaterials DEFAULT_REQUIRED_MATERIALS = new RequiredMaterials(0, 17, 0, 1);
    private final HashMap<Integer, Integer> varbMap = new HashMap();
    @Inject
    private SquireHomesConfig config;
    @Inject
    private OverlayManager overlayManager;
    @Inject
    private PlankSack plankSack;
    @Inject
    private EventBus eventBus;
    @Inject
    private HomesInfoBox paint;
    private Instant started;
    private Instant lastChanged;
    private int lastCompletedCount = -1;
    private Home currentHome;
    private int sessionContracts;
    private int sessionPoints;
    private boolean varbChange;
    private int planksBanked;

    protected Class<?>[] tasks() {
        return new Class[]{FurnitureTask.class, CreationMenuTask.class, HandleStairs.class, CompleteTask.class, TravelToHouse.class, GetAssignment.class, BankTask.class, CheckSack.class, EmptySack.class, DialogSpacebar.class};
    }

    protected void onStart() {
        this.plankSack.init();
        this.eventBus.register((Object)this.plankSack);
        this.overlayManager.add((Overlay)this.paint);
        this.started = Instant.now();
        if (Static.getClient().getGameState() == GameState.LOGGED_IN) {
            Static.getClientThread().invoke(this::updateVarbMap);
        }
        this.lastChanged = Instant.now();
        this.lastCompletedCount = 0;
        this.currentHome = null;
    }

    protected void onStop() {
        this.eventBus.unregister((Object)this.plankSack);
        this.overlayManager.remove((Overlay)this.paint);
        this.currentHome = null;
        this.lastChanged = null;
        this.lastCompletedCount = -1;
        this.varbMap.clear();
    }

    @Provides
    SquireHomesConfig getConfig(ConfigManager configManager) {
        return (SquireHomesConfig)configManager.getConfig(SquireHomesConfig.class);
    }

    public RequiredMaterials getRequiredMaterials() {
        Home currentHome = this.getCurrentHome();
        if (currentHome == null) {
            return DEFAULT_REQUIRED_MATERIALS;
        }
        return currentHome.getRequiredMaterialsByTier().getByTier(this.config.contract().getDialogOption());
    }

    public int getTotalPlanks() {
        Contract contract = this.config.contract();
        String itemName = contract.getItemName();
        int planks = Inventory.getCount((String[])new String[]{itemName});
        if (this.config.sack()) {
            planks += this.plankSack.getPlanks(contract);
        }
        return planks;
    }

    public boolean hasItems() {
        RequiredMaterials requiredMaterials = this.getRequiredMaterials();
        int ourBarAmount = Inventory.getCount((int[])new int[]{2353});
        int ourPlankAmount = this.getTotalPlanks();
        return ourBarAmount >= requiredMaterials.getMaxSteelBars() && ourPlankAmount >= requiredMaterials.getMaxPlanks();
    }

    public InventorySetup getInventorySetup() {
        InventorySetup inventorySetup = new InventorySetup();
        inventorySetup.add(2353, 2);
        inventorySetup.add(this.config.contract().getItemName(), 24);
        inventorySetup.add(2347, 1);
        inventorySetup.add(8794, 1);
        return inventorySetup;
    }

    private void updateVarbMap() {
        this.varbMap.clear();
        for (Hotspot spot : Hotspot.values()) {
            this.varbMap.put(spot.getVarb(), Static.getClient().getVarbitValue(spot.getVarb()));
        }
    }

    @Subscribe
    public void onVarbitChanged(VarbitChanged event) {
        this.updateVarbMap();
        int completed = this.getCompletedCount();
        if (completed != this.lastCompletedCount) {
            this.lastCompletedCount = completed;
            this.lastChanged = Instant.now();
        }
    }

    @Subscribe
    public void onChatMessage(ChatMessage e) {
        String input;
        if (!e.getType().equals((Object)ChatMessageType.GAMEMESSAGE)) {
            return;
        }
        if (e.getMessage().contains("Your sack is full")) {
            this.plankSack.add(this.config.contract().ordinal(), 28);
        }
        if (CONTRACT_FINISHED.matcher(input = net.runelite.api.util.Text.removeTags((String)e.getMessage())).matches()) {
            this.setCurrentHome(null);
            ++this.sessionContracts;
            this.sessionPoints += this.getPointsForCompletingTask();
        }
        this.getHomeFrom(input);
    }

    public boolean checkForAssignmentDialog(String text) {
        String npcText = Text.sanitizeMultilineText((String)text);
        Matcher startContractMatcher = CONTRACT_PATTERN.matcher(npcText);
        Matcher reminderContract = REMINDER_PATTERN.matcher(npcText);
        String name = null;
        int tier = -1;
        if (startContractMatcher.matches()) {
            name = startContractMatcher.group(2);
        } else if (reminderContract.matches()) {
            name = reminderContract.group(2);
            tier = this.getTierByText(reminderContract.group(1));
        }
        if (name != null) {
            for (Home h : Home.values()) {
                if (!h.getName().equalsIgnoreCase(name) || this.currentHome == h) continue;
                this.setCurrentHome(h);
                return true;
            }
        }
        return false;
    }

    private int getTierByText(String tierText) {
        switch (tierText) {
            case "Beginner": {
                return 1;
            }
            case "Novice": {
                return 2;
            }
            case "Adept": {
                return 3;
            }
            case "Expert": {
                return 4;
            }
        }
        return -1;
    }

    public boolean getHomeFrom(String text) {
        text = net.runelite.api.util.Text.removeTags((String)text);
        int goSeeIndex = (text = text.split("\\. ")[1]).indexOf("Go see");
        if (goSeeIndex == -1) {
            log.info("Cannot get home, 'Go see' not found in text");
            return false;
        }
        String subString = text.substring(goSeeIndex + "Go see".length()).trim();
        String npc = subString.split(" ")[0];
        if (npc.contains(",")) {
            npc = npc.split(",")[0].trim();
        }
        if (npc.contains("along")) {
            npc = npc.replace("along", "").trim();
        }
        for (Home h : Home.values()) {
            if (!h.getName().equalsIgnoreCase(npc.trim())) continue;
            this.setCurrentHome(h);
            return true;
        }
        return false;
    }

    public boolean isWorkFinished() {
        return Stream.of(Hotspot.values()).flatMap(h -> h.getObjectIds().stream()).noneMatch(Hotspot::requiresAttention);
    }

    int getPointsForCompletingTask() {
        int tier = 0;
        for (int val : this.varbMap.values()) {
            tier = Math.max(tier, val);
        }
        if ((tier -= 4) < 0) {
            return 0;
        }
        return tier + 1;
    }

    int getCompletedCount() {
        if (this.currentHome == null) {
            return -1;
        }
        int count = 0;
        for (Hotspot hotspot : Hotspot.values()) {
            boolean requiresAttention = this.doesHotspotRequireAttention(hotspot.getVarb());
            if (!requiresAttention) continue;
            ++count;
        }
        return count;
    }

    public boolean doesHotspotRequireAttention(int varb) {
        Integer val = this.varbMap.get(varb);
        if (val == null) {
            return false;
        }
        return val == 1 || val == 3 || val == 4;
    }

    @Subscribe
    private void onWidgetLoaded(WidgetLoaded widget) {
        if (Bank.isOpen()) {
            this.setPlanksBanked(Bank.getCount((boolean)true, (String[])new String[]{this.config.contract().getItemName()}));
        }
    }

    public SquireHomesConfig getConfig() {
        return this.config;
    }

    public Instant getStarted() {
        return this.started;
    }

    public Instant getLastChanged() {
        return this.lastChanged;
    }

    public int getLastCompletedCount() {
        return this.lastCompletedCount;
    }

    public Home getCurrentHome() {
        return this.currentHome;
    }

    public void setCurrentHome(Home currentHome) {
        this.currentHome = currentHome;
    }

    public int getSessionContracts() {
        return this.sessionContracts;
    }

    public void setSessionContracts(int sessionContracts) {
        this.sessionContracts = sessionContracts;
    }

    public int getSessionPoints() {
        return this.sessionPoints;
    }

    public void setSessionPoints(int sessionPoints) {
        this.sessionPoints = sessionPoints;
    }

    public boolean isVarbChange() {
        return this.varbChange;
    }

    public void setVarbChange(boolean varbChange) {
        this.varbChange = varbChange;
    }

    public int getPlanksBanked() {
        return this.planksBanked;
    }

    public void setPlanksBanked(int planksBanked) {
        this.planksBanked = planksBanked;
    }
}

