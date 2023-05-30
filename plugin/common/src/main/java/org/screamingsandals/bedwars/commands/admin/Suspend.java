package org.screamingsandals.bedwars.commands.admin;


public class Suspend extends BaseAdminSubCommand {
    public Suspend() {
        super("suspend");
    }

    @Override
    public void construct(CommandManager<CommandSenderWrapper> manager, Command.Builder<CommandSenderWrapper> commandSenderWrapperBuilder) {
        manager.command(
                commandSenderWrapperBuilder
                        .argument(StringArgument
                                .<CommandSenderWrapper>newBuilder("arena")
                        ))
    }
}
