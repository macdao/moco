package com.github.dreamhead.moco.bootstrap.arg;

import static com.github.dreamhead.moco.bootstrap.ServerType.SOCKET;

public final class SocketArgs extends StartArgs {
    private SocketArgs(final Integer port, final Integer shutdownPort, final String[] configurationFiles,
                       final boolean watchService) {
        super(SOCKET, port, shutdownPort, configurationFiles, null, null, null, watchService);
    }

    public static Builder socketArgs() {
        return new Builder();
    }

    public static class Builder {
        private Integer port;
        private Integer shutdownPort;
        private String[] configurationFiles;
        private boolean watchService;

        public Builder withPort(final Integer port) {
            this.port = port;
            return this;
        }

        public Builder withShutdownPort(final Integer shutdownPort) {
            this.shutdownPort = shutdownPort;
            return this;
        }

        public Builder withConfigurationFile(final String... configurationFiles) {
            this.configurationFiles = configurationFiles;
            return this;
        }

        public Builder withWatchService(final boolean watchService) {
            this.watchService = watchService;
            return this;
        }

        public SocketArgs build() {
            return new SocketArgs(port, shutdownPort, configurationFiles, watchService);
        }
    }
}
