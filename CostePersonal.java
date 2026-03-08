public class CostePersonal {

    public static final int PRECIO_HORA_EXTRA = 20;

    static float costeDelPersonal(Trabajador[] trabajadores) {
        float costeFinal = 0;
        Trabajador trabajador;
        costeFinal = getCosteFinal(trabajadores, costeFinal);
        return costeFinal;
    }

    private static float getCosteFinal(Trabajador[] trabajadores, float costeFinal) {
        Trabajador trabajador;
        for (int i = 0; i < trabajadores.length; i++) {
            trabajador = trabajadores[i];
            if (trabajador.getTipoTrabajador() == Trabajador.DIRECTOR|| trabajador.getTipoTrabajador() == Trabajador.SUBDIRECTOR) {
                costeFinal += trabajador.getNomina();
            }
            else
            {
                costeFinal += trabajador.getNomina() + (trabajador.getHorasExtras() * PRECIO_HORA_EXTRA);
            }
        }
        return costeFinal;
    }
}