# Live Chat Application - Back-end
Este projeto implementa um chat em tempo real utilizando Java, Spring Boot, WebSocket e STOMP para comunicação bidirecional eficiente entre o servidor e os clientes. A aplicação suporta mensagens instantâneas entre vários usuários conectados simultaneamente, ideal para sistemas que requerem comunicação em tempo real.

# Funcionalidades principais
- Chat em tempo real: As mensagens enviadas por qualquer usuário são transmitidas instantaneamente para todos os participantes do chat.
- WebSocket: Utilizamos WebSocket para garantir uma comunicação contínua e de baixa latência entre cliente e servidor.
- STOMP: O protocolo STOMP foi usado para simplificar a comunicação via WebSocket, facilitando a troca de mensagens em canais específicos (salas de chat).
- Escalabilidade: A aplicação pode ser escalada horizontalmente utilizando a configuração de WebSockets com suporte para clusters.
# Tecnologias Utilizadas
- Java: Linguagem principal usada no back-end.
- Spring Boot: Framework utilizado para construir a API e gerenciar as dependências.
- Spring WebSocket: Para a implementação da conexão WebSocket no servidor.
- STOMP: Para o gerenciamento das mensagens no canal WebSocket.
- Elastic Beanstalk: O projeto está hospedado e rodando na AWS usando Elastic Beanstalk para fácil deployment e gerenciamento.
# Como Funciona
- Conexão WebSocket: O cliente inicia uma conexão WebSocket com o servidor em um endpoint específico.
- STOMP Handshake: Após a conexão WebSocket ser estabelecida, o protocolo STOMP gerencia a comunicação. Os usuários se inscrevem em tópicos (salas de chat) e podem enviar e receber mensagens.
- Mensagens em Tempo Real: Quando uma mensagem é enviada, ela é entregue a todos os clientes inscritos no mesmo canal em tempo real, sem a necessidade de polling ou outras técnicas ineficientes.
- Endpoints do WebSocket
- A seguir, os principais endpoints de WebSocket definidos no back-end:

- /buildrun-livechat: Endpoint para estabelecer a conexão WebSocket.
- /new-message: Endereço usado para enviar mensagens ao servidor.
- /topics/livechat: Canal público onde todos os usuários podem receber as mensagens enviadas.

# Como Acessar

- O deploy do projeto foi feito pela AWS utilizando Elastic Beanstalk e está acessível no link http://livechat-run.sa-east-1.elasticbeanstalk.com
- Para utilizar basta colocar seu nome de usuario e se conectar, após isso escreva mensagem no campo e clique em send para enviar sua mensagem
