/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.runelite.api.coords.WorldPoint
 */
package net.unethicalite.api.movement.pathfinder.model.dto;

import java.util.Arrays;
import net.runelite.api.coords.WorldPoint;
import net.unethicalite.api.movement.pathfinder.TransportLoader;
import net.unethicalite.api.movement.pathfinder.model.Transport;
import net.unethicalite.api.movement.pathfinder.model.requirement.ItemRequirement;
import net.unethicalite.api.movement.pathfinder.model.requirement.Requirements;

public final class TransportDto {
    private final WorldPoint source;
    private final WorldPoint destination;
    private final ActionData data;
    private final Requirements requirements;
    private final String id;
    private final TransportType type;

    public Transport toTransport() {
        if (this.type == TransportType.OBJECT) {
            Transport object = TransportLoader.objectTransport(this.source, this.destination, this.data.getId(), this.data.getAction(), this.requirements);
            if (this.data.getDialog() != null) {
                return TransportLoader.dialogTransport(this.source, this.destination, this.data.getDialog(), object);
            }
            return object;
        }
        if (this.type == TransportType.NPC) {
            int id = this.data.getId();
            if (id != -1) {
                if (this.data.getAction() != null && this.data.getDialog() != null) {
                    return TransportLoader.npcActionAndDialogTransport(this.source, this.destination, this.data.getId(), this.requirements, this.data.getAction(), this.data.getDialog());
                }
                if (this.data.getAction() != null && !this.data.getAction().isEmpty()) {
                    return TransportLoader.npcTransport(this.source, this.destination, this.data.getId(), this.requirements, this.data.getAction());
                }
                return TransportLoader.npcDialogTransport(this.source, this.destination, this.data.getId(), this.requirements, this.data.getDialog());
            }
            if (this.data.getAction() != null && !this.data.getAction().isEmpty()) {
                return TransportLoader.npcTransport(this.source, this.destination, this.data.getName(), this.requirements, this.data.getAction());
            }
            return TransportLoader.npcDialogTransport(this.source, this.destination, this.data.getName(), this.requirements, this.data.getDialog());
        }
        if (this.type == TransportType.ITEM_USE) {
            if (this.requirements.getItemRequirements().isEmpty()) {
                return null;
            }
            ItemRequirement requirement = this.requirements.getItemRequirements().get(0);
            return TransportLoader.itemUseTransport(this.source, this.destination, requirement.getIds().get(0), this.data.getId());
        }
        return null;
    }

    public TransportDto(WorldPoint source, WorldPoint destination, ActionData data, Requirements requirements, String id, TransportType type) {
        this.source = source;
        this.destination = destination;
        this.data = data;
        this.requirements = requirements;
        this.id = id;
        this.type = type;
    }

    public WorldPoint getSource() {
        return this.source;
    }

    public WorldPoint getDestination() {
        return this.destination;
    }

    public ActionData getData() {
        return this.data;
    }

    public Requirements getRequirements() {
        return this.requirements;
    }

    public String getId() {
        return this.id;
    }

    public TransportType getType() {
        return this.type;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TransportDto)) {
            return false;
        }
        TransportDto other = (TransportDto)o;
        WorldPoint this$source = this.getSource();
        WorldPoint other$source = other.getSource();
        if (this$source == null ? other$source != null : !this$source.equals(other$source)) {
            return false;
        }
        WorldPoint this$destination = this.getDestination();
        WorldPoint other$destination = other.getDestination();
        if (this$destination == null ? other$destination != null : !this$destination.equals(other$destination)) {
            return false;
        }
        ActionData this$data = this.getData();
        ActionData other$data = other.getData();
        if (this$data == null ? other$data != null : !((Object)this$data).equals(other$data)) {
            return false;
        }
        Requirements this$requirements = this.getRequirements();
        Requirements other$requirements = other.getRequirements();
        if (this$requirements == null ? other$requirements != null : !((Object)this$requirements).equals(other$requirements)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        TransportType this$type = this.getType();
        TransportType other$type = other.getType();
        return !(this$type == null ? other$type != null : !((Object)((Object)this$type)).equals((Object)other$type));
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        WorldPoint $source = this.getSource();
        result = result * 59 + ($source == null ? 43 : $source.hashCode());
        WorldPoint $destination = this.getDestination();
        result = result * 59 + ($destination == null ? 43 : $destination.hashCode());
        ActionData $data = this.getData();
        result = result * 59 + ($data == null ? 43 : ((Object)$data).hashCode());
        Requirements $requirements = this.getRequirements();
        result = result * 59 + ($requirements == null ? 43 : ((Object)$requirements).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        TransportType $type = this.getType();
        result = result * 59 + ($type == null ? 43 : ((Object)((Object)$type)).hashCode());
        return result;
    }

    public String toString() {
        return "TransportDto(source=" + String.valueOf(this.getSource()) + ", destination=" + String.valueOf(this.getDestination()) + ", data=" + String.valueOf(this.getData()) + ", requirements=" + String.valueOf(this.getRequirements()) + ", id=" + this.getId() + ", type=" + String.valueOf((Object)this.getType()) + ")";
    }

    public static class ActionData {
        int id;
        String action;
        String name;
        String[] dialog;

        public int getId() {
            return this.id;
        }

        public String getAction() {
            return this.action;
        }

        public String getName() {
            return this.name;
        }

        public String[] getDialog() {
            return this.dialog;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDialog(String[] dialog) {
            this.dialog = dialog;
        }

        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof ActionData)) {
                return false;
            }
            ActionData other = (ActionData)o;
            if (!other.canEqual(this)) {
                return false;
            }
            if (this.getId() != other.getId()) {
                return false;
            }
            String this$action = this.getAction();
            String other$action = other.getAction();
            if (this$action == null ? other$action != null : !this$action.equals(other$action)) {
                return false;
            }
            String this$name = this.getName();
            String other$name = other.getName();
            if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
                return false;
            }
            return Arrays.deepEquals(this.getDialog(), other.getDialog());
        }

        protected boolean canEqual(Object other) {
            return other instanceof ActionData;
        }

        public int hashCode() {
            int PRIME = 59;
            int result = 1;
            result = result * 59 + this.getId();
            String $action = this.getAction();
            result = result * 59 + ($action == null ? 43 : $action.hashCode());
            String $name = this.getName();
            result = result * 59 + ($name == null ? 43 : $name.hashCode());
            result = result * 59 + Arrays.deepHashCode(this.getDialog());
            return result;
        }

        public String toString() {
            return "TransportDto.ActionData(id=" + this.getId() + ", action=" + this.getAction() + ", name=" + this.getName() + ", dialog=" + Arrays.deepToString(this.getDialog()) + ")";
        }
    }

    public static enum TransportType {
        OBJECT,
        NPC,
        ITEM_USE;

    }
}
