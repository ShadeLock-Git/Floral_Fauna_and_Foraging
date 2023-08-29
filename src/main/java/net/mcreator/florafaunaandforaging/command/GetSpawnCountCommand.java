
package net.mcreator.florafaunaandforaging.command;

@Mod.EventBusSubscriber
public class GetSpawnCountCommand {

	@SubscribeEvent
	public static void registerCommand(RegisterCommandsEvent event) {
		event.getDispatcher().register(Commands.literal("getspawncount")

				.executes(arguments -> {
					ServerLevel world = arguments.getSource().getLevel();

					double x = arguments.getSource().getPosition().x();
					double y = arguments.getSource().getPosition().y();
					double z = arguments.getSource().getPosition().z();

					Entity entity = arguments.getSource().getEntity();
					if (entity == null)
						entity = FakePlayerFactory.getMinecraft(world);

					Direction direction = entity.getDirection();

					DebugSpawnCountProcedure.execute(world);
					return 0;
				}));
	}

}
