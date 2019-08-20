package derfl007.roads.common.blocks.trafficlights;

import derfl007.roads.common.blocks.BlockRoadSign;
import derfl007.roads.init.RoadBlocks;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockRoadTrafficLight extends BlockRoadSign {
	
	  public static final PropertyDirection FACING = BlockHorizontal.FACING;
	
	public BlockRoadTrafficLight(){
		super("road_traffic_light_manual");
	}
	
	@Override
	public void onBlockAdded(World worldIn, BlockPos pos, IBlockState state) {
		super.onBlockAdded(worldIn, pos, state);
		worldIn.setBlockState(pos, RoadBlocks.road_traffic_light_green_dyn.getDefaultState().withProperty(FACING, state.getValue(FACING)), 2);
	}

}
