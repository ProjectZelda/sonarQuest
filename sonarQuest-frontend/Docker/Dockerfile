FROM node:9.11.1
COPY  . /usr/src/sonarQuest
WORKDIR /usr/src/sonarQuest
RUN rm -rf ./node_modules
RUN chown node:node /usr/src/sonarQuest
RUN mkdir /home/node/.npm-global
ENV PATH=/home/node/.npm-global/bin:$PATH
ENV NPM_CONFIG_PREFIX=/home/node/.npm-global
ENV npm_config_registry=http://nexus.standardbank.co.za:8090/nexus/content/repositories/npmjs/
RUN npm install -g @angular/cli
RUN npm config set proxy http://sbicza01\a142337:rzAug2018@websenseproxy.standardbank.co.za:8080
RUN npm install
RUN npm run build
EXPOSE 4200
ENTRYPOINT ["node", "server.js"]
