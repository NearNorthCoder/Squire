/*
 * Decompiled with CFR 0.152.
 */
package net.runelite.api.events;

public class ImageCaptured {
    private final String fileName;
    private final String directory;

    public ImageCaptured(String fileName, String directory) {
        this.fileName = fileName;
        this.directory = directory;
    }

    public String getFileName() {
        return this.fileName;
    }

    public String getDirectory() {
        return this.directory;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ImageCaptured)) {
            return false;
        }
        ImageCaptured other = (ImageCaptured)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$fileName = this.getFileName();
        String other$fileName = other.getFileName();
        if (this$fileName == null ? other$fileName != null : !this$fileName.equals(other$fileName)) {
            return false;
        }
        String this$directory = this.getDirectory();
        String other$directory = other.getDirectory();
        return !(this$directory == null ? other$directory != null : !this$directory.equals(other$directory));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ImageCaptured;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $fileName = this.getFileName();
        result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
        String $directory = this.getDirectory();
        result = result * 59 + ($directory == null ? 43 : $directory.hashCode());
        return result;
    }

    public String toString() {
        return "ImageCaptured(fileName=" + this.getFileName() + ", directory=" + this.getDirectory() + ")";
    }
}

