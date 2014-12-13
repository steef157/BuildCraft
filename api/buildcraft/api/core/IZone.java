/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.api.core;

import java.util.Random;
import net.minecraft.util.BlockPos;

public interface IZone {

	double distanceTo(BlockPos pos);

	boolean contains(double x, double y, double z);

	BlockPos getRandomBlockIndex(Random rand);

}
