package net.marakaner.gamehandler.util;

import lombok.Getter;
import org.bukkit.Location;
import org.bukkit.World;


@Getter
public class SimpleLocation {

    private double x, y, z;
    private float yaw, pitch;

    public SimpleLocation(double x, double y, double z, float yaw, float pitch) {
        this.x = x;
        this.y = y;
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public SimpleLocation(Location location) {
        this(location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());
    }

    public Location toBukkitLocation(World world) {
        return new Location(world, this.x, this.y, this.z, this.yaw, this.pitch);
    }



}
