webpackJsonp([26],{229:function(e,t,a){var i=a(138)(a(692),a(700),null,null);e.exports=i.exports},692:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0}),t.default={props:{dossier_id:{type:Number},action_id:{type:Number}},data:function(){return{itemId:null,fieldNameID:"",date:null,dialog:!1,formBuilder:[],rulesValid:{number:function(e){return/^\d+$/.test(e)||"Kiểu dữ liệu sai định dạng."}}}},created:function(){var e=this;e.$nextTick(function(){var t={dossierId:e.dossier_id,actionId:e.action_id};e.$store.dispatch("getExtraForm",t).then(function(t){e.formBuilder=t})})},methods:{openDialogCustom:function(e,t){var a=this;a.dialog=!0,a.fieldNameID=t,a.itemId=e},pickDateCustom:function(){var e=this;e.itemId.value=e.dateTimeView(e.date),e.dialog=!1},inputChangeValue:function(e){e.value=document.getElementById(e.fieldName).value},dateTimeView:function(e){if(e){var t=new Date(e);return t.getDate().toString().padStart(2,"0")+"/"+(t.getMonth()+1).toString().padStart(2,"0")+"/"+t.getFullYear()}return""},formSubmitData:function(){var e=this,t={};for(var a in e.formBuilder)t[e.formBuilder[a].fieldName]=e.formBuilder[a].value;return t}}}},700:function(e,t){e.exports={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("v-expansion-panel",{staticClass:"expansion-pl ext__form"},e._l(e.formBuilder,function(t,i){return a("v-expansion-panel-content",{key:i,attrs:{"hide-actions":"",value:"1"}},[a("div",{attrs:{slot:"header"},slot:"header"},[a("div",{staticClass:"background-triangle-small"},[a("v-icon",{attrs:{size:"18",color:"white"}},[e._v("star_rate")])],1),e._v("\n      "+e._s(t.fieldLabel)+"\n      ")]),e._v(" "),a("v-card",[a("v-card-text",{staticClass:"py-2 px-2"},[a("v-layout",{attrs:{wrap:""}},[a("v-flex",{attrs:{xs12:""}},["textarea"===t.fieldType?a("v-text-field",{attrs:{id:t.fieldName,value:t.value,placeholder:t.placeholder,"multi-line":""},on:{input:function(a){e.inputChangeValue(t)}}}):e._e(),e._v(" "),"string"===t.fieldType?a("v-text-field",{attrs:{id:t.fieldName,value:t.value,placeholder:t.placeholder},on:{input:function(a){e.inputChangeValue(t)}}}):e._e(),e._v(" "),"number"===t.fieldType?a("v-text-field",{attrs:{id:t.fieldName,value:t.value,placeholder:t.placeholder,rules:[e.rulesValid.number]},on:{input:function(a){e.inputChangeValue(t)}}}):e._e(),e._v(" "),"date"===t.fieldType?a("v-text-field",{attrs:{id:t.fieldName,value:t.value,placeholder:t.placeholder,readonly:"","append-icon":"event"},nativeOn:{click:function(a){e.openDialogCustom(t,t.fieldName)}}}):e._e()],1)],1)],1),e._v(" "),a("v-dialog",{attrs:{width:"500"},model:{value:e.dialog,callback:function(t){e.dialog=t},expression:"dialog"}},[a("v-date-picker",{attrs:{"full-width":"",landscape:""},model:{value:e.date,callback:function(t){e.date=t},expression:"date"}}),e._v(" "),a("v-card-actions",{staticStyle:{background:"#fff"}},[a("v-spacer"),e._v(" "),a("v-btn",{attrs:{color:"primary",flat:""},on:{click:e.pickDateCustom}},[e._v("\n                Xác nhận\n            ")])],1)],1)],1)],1)}))},staticRenderFns:[]}}});
//# sourceMappingURL=26.5f94e8d0c831c6902b63.js.map