(function(e){function t(t){for(var n,l,s=t[0],i=t[1],o=t[2],u=0,j=[];u<s.length;u++)l=s[u],Object.prototype.hasOwnProperty.call(r,l)&&r[l]&&j.push(r[l][0]),r[l]=0;for(n in i)Object.prototype.hasOwnProperty.call(i,n)&&(e[n]=i[n]);b&&b(t);while(j.length)j.shift()();return a.push.apply(a,o||[]),c()}function c(){for(var e,t=0;t<a.length;t++){for(var c=a[t],n=!0,s=1;s<c.length;s++){var i=c[s];0!==r[i]&&(n=!1)}n&&(a.splice(t--,1),e=l(l.s=c[0]))}return e}var n={},r={app:0},a=[];function l(t){if(n[t])return n[t].exports;var c=n[t]={i:t,l:!1,exports:{}};return e[t].call(c.exports,c,c.exports,l),c.l=!0,c.exports}l.m=e,l.c=n,l.d=function(e,t,c){l.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:c})},l.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},l.t=function(e,t){if(1&t&&(e=l(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var c=Object.create(null);if(l.r(c),Object.defineProperty(c,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var n in e)l.d(c,n,function(t){return e[t]}.bind(null,n));return c},l.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return l.d(t,"a",t),t},l.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},l.p="/";var s=window["webpackJsonp"]=window["webpackJsonp"]||[],i=s.push.bind(s);s.push=t,s=s.slice();for(var o=0;o<s.length;o++)t(s[o]);var b=i;a.push([0,"chunk-vendors"]),c()})({0:function(e,t,c){e.exports=c("56d7")},2263:function(e,t,c){},"4b8a":function(e,t,c){"use strict";c("8463")},"56d7":function(e,t,c){"use strict";c.r(t);c("e260"),c("e6cf"),c("cca6"),c("a79d"),c("caad"),c("2532"),c("d3b7"),c("25f0"),c("ac1f"),c("5319");var n=c("7a23"),r=(c("b0c0"),c("841c"),{class:"marquee w-full h-12 overflow-hidden position-relative"}),a={class:"marquee-content h-full flex",ref:"mq"},l={class:"flex justify-between w-3/4"},s={class:"flex items-center"},i=["src"],o={class:"hidden lg:block"},b={class:"font-bold"},u={class:"text-xs uppercase tracking-widest"},j={class:"font-bold text-xs lg:text-base flex justify-end"},d={key:0,class:"font-bold text-xs text-red-400 flex justify-end items-center"},f={key:1,class:"font-bold text-xs text-green-400 flex justify-end items-center"},p={class:"flex justify-between w-3/4"},O={class:"flex items-center"},g=["src"],m={class:"hidden lg:block"},h={class:"font-bold"},x={class:"text-xs uppercase tracking-widest"},v={class:"font-bold flex justify-end text-xs lg:text-base"},y={key:0,class:"font-bold text-xs text-red-400 flex justify-end items-center"},_={key:1,class:"font-bold text-xs text-green-400 flex justify-end items-center"},w={class:"container mx-auto pt-18 px-2"},k={class:"table-fixed cursor-pointer"},$=Object(n["e"])("caption",{class:"table-title font-bold text-gray-700 pb-2"},"Cryptocurrency Exchange - Top 20 (Market Cap)",-1),C={class:"relative text-left text-gray-600 text-sm"},P={class:"p-2"},S=Object(n["f"])(" Search: "),M=Object(n["e"])("tr",{class:"text-left bg-gray-100 text-gray-600 text-sm"},[Object(n["e"])("th",{class:"w-1/4 p-4"},"Coin Name"),Object(n["e"])("th",{class:"w-1/4"},"Market Price(Real Time)"),Object(n["e"])("th",{class:"w-1/4"},"Change%(24 Hours)"),Object(n["e"])("th",{class:"w-1/4 hidden sm:table-cell"},"Trading Volume"),Object(n["e"])("th",{class:"w-1/4 hidden sm:table-cell"},"Market Capitalization")],-1),T={class:"divide-y"},q={class:"p-4 flex items-center"},N={class:"mr-2"},R=["src"],J={class:"font-bold p-1 mr-1"},V={class:"uppercase text-gray-500 hidden sm:table-cell"},z={class:"font-bold text-gray-600"},A={class:"font-bold"},B={key:0,class:"text-red-500"},E={key:1,class:"text-green-500"},H={class:"hidden sm:table-cell"},I={style:{color:"rgb(26, 137, 165)"}},U={class:"pr-10 hidden sm:table-cell"},D={style:{color:"rgb(26, 137, 165)"}};function F(e,t,c,F,G,K){var L=Object(n["m"])("fa");return Object(n["j"])(),Object(n["d"])(n["a"],null,[Object(n["e"])("div",r,[Object(n["e"])("ul",a,[(Object(n["j"])(!0),Object(n["d"])(n["a"],null,Object(n["l"])(F.tenCoins,(function(t){return Object(n["j"])(),Object(n["d"])("li",{class:"flex justify-center items-center flex-shrink-0 text-white transform scale-75 lg:scale-100",key:t.name},[Object(n["e"])("div",l,[Object(n["e"])("div",s,[Object(n["e"])("img",{src:t.image,alt:"coin logo",class:"w-4 h-4 lg:w-6 lg:h-6 rounded-full mr-4 object-cover"},null,8,i),Object(n["e"])("div",o,[Object(n["e"])("p",b,Object(n["n"])(t.name),1),Object(n["e"])("p",u,Object(n["n"])(t.symbol),1)])]),Object(n["e"])("div",null,[Object(n["e"])("p",j,Object(n["n"])(e.$filters.comma_separator(t.current_price)),1),e.$filters.price_negative(t.price_change_percentage_24h)?(Object(n["j"])(),Object(n["d"])("p",d,[Object(n["g"])(L,{icon:"caret-down",class:"mr-1"}),Object(n["f"])(" "+Object(n["n"])(e.$filters.string_trunc(t.price_change_percentage_24h,5))+"% ",1)])):(Object(n["j"])(),Object(n["d"])("p",f,[Object(n["g"])(L,{icon:"caret-up",class:"mr-1"}),Object(n["f"])(" "+Object(n["n"])(e.$filters.string_trunc(t.price_change_percentage_24h,5))+"% ",1)]))])])])})),128)),(Object(n["j"])(!0),Object(n["d"])(n["a"],null,Object(n["l"])(F.cloneCoins,(function(t){return Object(n["j"])(),Object(n["d"])("li",{class:"flex justify-center items-center flex-shrink-0 text-white transform scale-75 lg:scale-100",key:t.name},[Object(n["e"])("div",p,[Object(n["e"])("div",O,[Object(n["e"])("img",{src:t.image,alt:"coin logo",class:"w-4 h-4 lg:w-6 lg:h-6 rounded-full mr-4"},null,8,g),Object(n["e"])("div",m,[Object(n["e"])("p",h,Object(n["n"])(t.name),1),Object(n["e"])("p",x,Object(n["n"])(t.symbol),1)])]),Object(n["e"])("div",null,[Object(n["e"])("p",v,Object(n["n"])(e.$filters.comma_separator(t.current_price)),1),e.$filters.price_negative(t.price_change_percentage_24h)?(Object(n["j"])(),Object(n["d"])("p",y,[Object(n["g"])(L,{icon:"caret-down",class:"mr-1"}),Object(n["f"])(" "+Object(n["n"])(e.$filters.string_trunc(t.price_change_percentage_24h,5))+"% ",1)])):(Object(n["j"])(),Object(n["d"])("p",_,[Object(n["g"])(L,{icon:"caret-up",class:"mr-1"}),Object(n["f"])(" "+Object(n["n"])(e.$filters.string_trunc(t.price_change_percentage_24h,5))+"% ",1)]))])])])})),128))],512)]),Object(n["e"])("div",w,[Object(n["e"])("table",k,[$,Object(n["e"])("thead",null,[Object(n["e"])("tr",C,[Object(n["e"])("td",P,[S,Object(n["r"])(Object(n["e"])("input",{type:"text",placeholder:"Coin Name ...",class:"border border-gray-500 rounded p-2","onUpdate:modelValue":t[0]||(t[0]=function(e){return F.search=e})},null,512),[[n["o"],F.search]])])]),M]),Object(n["e"])("tbody",T,[(Object(n["j"])(!0),Object(n["d"])(n["a"],null,Object(n["l"])(F.matchedNames,(function(t){return Object(n["j"])(),Object(n["d"])("tr",{class:"text-sm hover:bg-gray-100 transition duration-300",key:t.name},[Object(n["e"])("td",q,[Object(n["e"])("p",N,Object(n["n"])(t.market_cap_rank),1),Object(n["e"])("img",{src:t.image,alt:"coin logo",class:"w-7 h-7 rounded-full mr-1"},null,8,R),Object(n["e"])("p",J,Object(n["n"])(t.name),1),Object(n["e"])("p",V,Object(n["n"])(t.symbol),1)]),Object(n["e"])("td",z," $"+Object(n["n"])(e.$filters.comma_separator(t.current_price)),1),Object(n["e"])("td",A,[e.$filters.price_negative(t.price_change_percentage_24h)?(Object(n["j"])(),Object(n["d"])("div",B,[Object(n["g"])(L,{icon:"caret-down",class:"mr-1"}),Object(n["f"])(Object(n["n"])(t.price_change_percentage_24h)+"% ",1)])):(Object(n["j"])(),Object(n["d"])("div",E,[Object(n["g"])(L,{icon:"caret-up",class:"mr-1"}),Object(n["f"])(Object(n["n"])(t.price_change_percentage_24h)+"% ",1)]))]),Object(n["e"])("td",H,[Object(n["e"])("p",I,Object(n["n"])(e.$filters.comma_separator(t.total_volume)),1)]),Object(n["e"])("td",U,[Object(n["e"])("p",D,"$"+Object(n["n"])(e.$filters.comma_separator(t.market_cap)),1)])])})),128))])])])],64)}var G=c("1da1"),K=(c("fb6a"),c("4de4"),c("96cf"),c("2263"),c("bc3a")),L=c.n(K),Q={name:"App",setup:function(){var e=Object(n["k"])([]),t=Object(n["k"])([]),c=Object(n["k"])(""),r=function(){var t=Object(G["a"])(regeneratorRuntime.mark((function t(){var c;return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:return t.prev=0,t.next=3,L.a.get("http://localhost:8085/crypto/api/v1/coin/market");case 3:c=t.sent,e.value=c.data,t.next=10;break;case 7:t.prev=7,t.t0=t["catch"](0),console.log(t.t0);case 10:case"end":return t.stop()}}),t,null,[[0,7]])})));return function(){return t.apply(this,arguments)}}();setInterval((function(){r()}),3e4);var a=Object(n["b"])((function(){return e.value.slice(0,10)}));Object(n["q"])((function(){var c=e.value.slice(0,5);t.value=c}));var l=Object(n["b"])((function(){return e.value.filter((function(e){return e.id.includes(c.value)}))}));return{tenCoins:a,cloneCoins:t,matchedNames:l,search:c}}},W=(c("4b8a"),c("6b0d")),X=c.n(W);const Y=X()(Q,[["render",F]]);var Z=Y,ee=c("ecee"),te=c("c074"),ce=c("ad3d");ee["c"].add(te["b"],te["a"],te["c"]);var ne=Object(n["c"])(Z);ne.component("fa",ce["a"]),ne.mount("#app"),ne.config.globalProperties.$filters={price_negative:function(e){return e.toString().includes("-")?e:""},comma_separator:function(e){return e.toString().replace(/\B(?<!\.\d*)(?=(\d{3})+(?!\d))/g,",")},string_trunc:function(e,t){return e?(e=e.toString(),e.length<=t?e:e.substr(0,t)):""}}},8463:function(e,t,c){}});
//# sourceMappingURL=app.a34f7950.js.map