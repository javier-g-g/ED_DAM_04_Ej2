import java.util.List;


public class CostePersonal {

    private static final float PRECIO_HORA_EXTRA = 20.0f;

    static float costeDelPersonal(List<Trabajador> trabajadores) {
        float costeFinal = 0;

        for (Trabajador trabajador : trabajadores) {
            costeFinal += trabajador.getNomina();


            if (esPersonalOperativo(trabajador)) {
                costeFinal += trabajador.getHorasExtras() * PRECIO_HORA_EXTRA;
            }
        }
        return costeFinal;
    }
    private static boolean esPersonalOperativo(Trabajador t) {
        return t.getTipoTrabajador() != Trabajador.DIRECTOR &&
                t.getTipoTrabajador() != Trabajador.SUBDIRECTOR;
    }
}
