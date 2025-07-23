\# 🎬 Aplicación de Películas Favoritas







Esta aplicación permite a los usuarios registrar sus películas favoritas, consultar información y visualizar los pósters correspondientes mediante la API pública de OMDb. Incluye autenticación con JWT y persistencia de datos con PostgreSQL.







\# ✅ Requerimientos Funcionales







\## Registro de usuario



Registro de nuevos usuarios con validación básica en JS y almacenamiento en PostgreSQL.







\## Inicio de sesión



Autenticación mediante email y contraseña, con generación de token JWT.







\## Autenticación con JWT



Las rutas protegidas solo están accesibles con un token válido en el encabezado `Authorization`.







\## CRUD de usuarios y películas







\- \*\*Usuario\*\*: Crear, Leer, Actualizar, Eliminación lógica.  



\- \*\*Película\*\*: Crear, Buscar. \*(Otras operaciones se harán directamente desde backend por limitaciones de tiempo).\*







\## Consumo de OMDb API



Se obtiene el póster y metadatos como sinopsis y actores al registrar o editar películas.







\## Interfaz básica sin frameworks



Interfaz construida con HTML, CSS y JS puro, diseño responsive con media queries.







\## Validaciones de formularios



Validación de campos vacíos, formato de email y año correcto tanto en cliente como en servidor.







\## Protección de rutas en frontend



Si el token JWT no está presente o es inválido, se redirige automáticamente al login.





