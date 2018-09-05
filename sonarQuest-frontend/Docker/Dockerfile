FROM node:9.11.1
COPY  . /usr/src/sonarQuest
WORKDIR /usr/src/sonarQuest
RUN rm -rf ./node_modules
RUN chown node:node /usr/src/sonarQuest
RUN mkdir /home/node/.npm-global
ENV PATH=/home/node/.npm-global/bin:$PATH
ENV NPM_CONFIG_PREFIX=/home/node/.npm-global
RUN npm install -g @angular/cli
RUN npm install
RUN npm run build
EXPOSE 4200
ENTRYPOINT ["node", "server.js"]
