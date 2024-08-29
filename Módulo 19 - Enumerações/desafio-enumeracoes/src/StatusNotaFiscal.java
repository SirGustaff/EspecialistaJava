public enum StatusNotaFiscal {

    NAO_EMITIDA {
        @Override
        public boolean podeSerCancelada(double valorTotal) {
            return true;
        }

        @Override
        public boolean podeSerEmitida() {
            return true;
        }
    },
    EMITIDA {
        @Override
        public boolean podeSerCancelada(double valorTotal) {
            return valorTotal > 1_000;
        }

        @Override
        public boolean podeSerEmitida() {
            return false;
        }
    },
    CANCELADA {
        @Override
        public boolean podeSerCancelada(double valorTotal) {
            return false;
        }

        @Override
        public boolean podeSerEmitida() {
            return false;
        }
    };

    StatusNotaFiscal() {}

    public abstract boolean podeSerCancelada(double valorTotal);

    public abstract boolean podeSerEmitida();

}
