# language: es

Característica: Verificacion de boton habilitado para productos no disponible on line

  Esquema del escenario: Teniendo la lista de los productos y el sistema estable
    Dado el uso del API para verificar el SKU "<SKU>"
    Entonces valido si esta disponible
    Y si existe, entro a la ficha del producto
    Entonces verifico si se muestran los botones de despacho y retiro deshabilitados
    Y que el boton de consultar stock esté habilitado

    Ejemplos:
      |   SKU  |
      | 111225 |
      | 108139 |
      | 108140 |
