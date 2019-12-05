# language: es

Característica: Verificacion de boton habilitado para productos no disponible on line

  Esquema del escenario: Teniendo la lista de los productos y el sistema estable
    Dado que tengo que verificar el SKU "<SKU>"
    Entonces valido si esta disponible
    Y si existe, entro a la ficha del producto "<URL>"
    Entonces verifico si se muestra el mensaje de producto no disponible
    Y verifico si se muestran los botones de despacho y retiro deshabilitados

    Ejemplos:
      |   SKU  |                                URL                                  |
      | 118300 |    https://www.promart.pe/horno-microondas-samsung-age83x-xpe/p     |
      | 108139 |  https://www.promart.pe/carrete-cable-tw-cu-80c-12awg-750v-azul/p   |
      | 108140 |  https://www.promart.pe/carrete-cable-tw-cu-80c-14awg-750v-azul/p   |
