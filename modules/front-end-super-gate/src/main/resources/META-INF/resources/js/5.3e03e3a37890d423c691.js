webpackJsonp([5,15,22],{270:function(t,e,s){var a=s(195)(s(308),s(309),null,null);t.exports=a.exports},271:function(t,e,s){var a=s(195)(s(313),s(316),null,null);t.exports=a.exports},282:function(t,e,s){var a=s(195)(s(353),s(375),null,null);t.exports=a.exports},308:function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var a=s(196),o=s.n(a);e.default={data:function(){return{dossierTemplateItems:[],dossierMarksItems:[],dossierFilesItems:[],thongTinHoSo:{}}},computed:{loading:function(){return this.$store.getters.loading}},mounted:function(){var t=this;t.page=1,t.$nextTick(function(){})},methods:{resetCounterTemplate:function(t,e){t.commit,t.state;this.dossierTemplateItems.forEach(function(t){t.partNo===e.partNo&&(t.hasForm?t.count=1:t.count=0)})},recountFileTemplates:function(){var t=this;t.dossierTemplateItems.forEach(function(e){e.count=0,t.dossierFilesItems.forEach(function(t){e.partNo===t.dossierPartNo&&e.count++})})},initData:function(t){var e=this,s=[];console.log(t.dossierId),s.push(e.$store.dispatch("loadDossierTemplates",t)),s.push(e.$store.dispatch("loadDossierMark",t)),s.push(e.$store.dispatch("loadDossierFiles",t.dossierId)),e.thongTinHoSo=t,o.a.all(s).then(function(t){var s=t[0],a=t[1],o=t[2],i=[];i=a?s.map(function(t){return t.hasForm?t.count=1:t.count=0,a.forEach(function(e,s){e.dossierPartNo===t.partNo&&(t.fileType=e.fileType,t.fileCheck=e.fileCheck)}),t}):s.map(function(t){return t.hasForm?t.count=1:t.count=0,t.fileType=0,t.fileCheck=!1,t}),e.dossierTemplateItems=i,e.dossierFilesItems=o,e.dossierMarksItems=a,setTimeout(function(t){o.forEach(function(t){t.eForm&&e.$store.dispatch("loadAlpcaForm",t)})},500),console.log("dossierTemplateItems",e.dossierTemplateItems)}).catch(function(t){})},onDeleteAttackFiles:function(t){var e=this;console.log("delete"),e.dossierFilesItems.forEach(function(s){s.dossierPartNo===t.partNo&&(s.dossierId=e.thongTinHoSo.dossierId,e.$store.dispatch("deleteAttackFiles",s).then(function(s){e.resetCounterTemplate(t),e.$store.dispatch("loadDossierFiles",e.thongTinHoSo.dossierId)}).catch(function(t){}))})},pickFile:function(t){document.getElementById("file"+t.partNo).click()},onUploadSingleFile:function(t,e){var s=this;t.dataItem=e,t.dossierId=s.thongTinHoSo.dossierId,t.dossierTemplateNo=s.thongTinHoSo.dossierTemplateNo,s.$store.dispatch("uploadSingleFile",t).then(function(t){s.$store.dispatch("loadDossierFiles",s.thongTinHoSo.dossierId).then(function(t){s.dossierFilesItems=t,s.recountFileTemplates()})}).catch(function(t){})},loadAlpcaForm:function(t){var e=this;this.dossierFilesItems.forEach(function(s){s.dossierPartNo===t.partNo&&e.$store.dispatch("loadAlpcaForm",s)})},viewFile:function(t){var e=this,s=this;s.dossierFilesItems.forEach(function(a){a.dossierId=s.thongTinHoSo.dossierId,a.dossierPartNo===t.partNo&&e.$store.dispatch("viewFile",a)})}}}},309:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",[s("v-card",t._l(t.dossierTemplateItems,function(e,a){return 1===e.partType?s("div",{key:e.partNo,staticClass:"form_alpaca",staticStyle:{position:"relative"}},[s("v-expansion-panel",{staticClass:"expaned__list__data",class:{no_acction__event:!e.hasForm}},[s("v-expansion-panel-content",{attrs:{"hide-actions":"",value:!1}},[s("div",{attrs:{slot:"header"},slot:"header"},[s("div",{staticStyle:{width:"calc(100% - 370px)",display:"flex","align-items":"center","min-height":"38px",background:"#fff","padding-left":"15px"}},[s("span",{staticClass:"text-bold mr-2"},[t._v(t._s(a+1)+".")]),t._v(" "),s("span",{on:{click:function(s){t.loadAlpcaForm(e)}}},[t._v(t._s(e.partName)+" "),e.required?s("span",{staticStyle:{color:"red"}},[t._v(" (*)")]):t._e(),t._v(" "),e.hasForm?s("i",{staticStyle:{"font-size":"10px",color:"#0d71bb"}},[t._v("(Form trực tuyến)")]):t._e()])])]),t._v(" "),s("v-card",[s("v-card-text",[s("v-layout",{attrs:{wrap:""}},[s("v-flex",{staticClass:"text-xs-right",attrs:{xs12:""}},[s("div",{attrs:{id:"formAlpaca"+e.partNo}})])],1)],1)],1)],1)],1),t._v(" "),s("div",{staticClass:"absolute__btn group__thanh_phan"},[t.loading?s("content-placeholders",{staticClass:"mt-1"},[s("content-placeholders-text",{attrs:{lines:1}})],1):s("v-layout",{staticClass:"flex__checkbox",attrs:{row:"",wrap:""}},[s("v-flex",{staticClass:"layout wrap",staticStyle:{width:"260px"}},[s("v-checkbox",{staticClass:"flex",attrs:{light:"",color:"secondary"},model:{value:t.dossierTemplateItems[a].fileCheck,callback:function(e){t.$set(t.dossierTemplateItems[a],"fileCheck",e)},expression:"dossierTemplateItems[index].fileCheck"}}),t._v(" "),s("v-radio-group",{attrs:{row:""},model:{value:t.dossierTemplateItems[a].fileType,callback:function(e){t.$set(t.dossierTemplateItems[a],"fileType",e)},expression:"dossierTemplateItems[index].fileType"}},[s("v-radio",{attrs:{value:2,disabled:!t.dossierTemplateItems[a].fileCheck}}),t._v(" "),s("v-radio",{attrs:{value:0,disabled:!t.dossierTemplateItems[a].fileCheck}}),t._v(" "),s("v-radio",{attrs:{value:1,disabled:!t.dossierTemplateItems[a].fileCheck}})],1)],1),t._v(" "),s("v-flex",{staticStyle:{width:"110px",background:"#fff"}},[s("v-tooltip",{attrs:{top:""}},[s("v-btn",{staticClass:"mx-0 my-0",attrs:{slot:"activator",icon:""},slot:"activator"},[s("v-badge",[s("input",{staticStyle:{display:"none"},attrs:{type:"file",id:"file"+e.partNo},on:{change:function(s){t.onUploadSingleFile(s,e)}}}),t._v(" "),s("v-icon",{attrs:{size:"16",color:"primary"},on:{click:function(s){t.pickFile(e)}}},[t._v("attach_file")])],1)],1),t._v(" "),s("span",[t._v("Tải file lên")])],1),t._v(" "),s("v-tooltip",{attrs:{top:""}},[s("v-btn",{staticClass:"mx-0",staticStyle:{height:"20px",width:"20px"},attrs:{slot:"activator",fab:"",dark:"",small:"",color:"primary"},on:{click:function(s){t.viewFile(e)}},slot:"activator"},[t._v("\n                "+t._s(e.count)+"\n              ")]),t._v(" "),s("span",[t._v("Xem")])],1),t._v(" "),s("v-tooltip",{attrs:{top:""}},[s("v-btn",{staticClass:"mx-0 my-0",attrs:{slot:"activator",icon:""},on:{click:function(s){t.onDeleteAttackFiles(e)}},slot:"activator"},[s("v-icon",{staticClass:"mx-0",attrs:{size:"16",color:"red darken-3"}},[t._v("delete")])],1),t._v(" "),s("span",[t._v("Xóa")])],1)],1)],1)],1)],1):t._e()})),t._v(" "),t._m(0)],1)},staticRenderFns:[function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"absolute-lable",staticStyle:{"font-size":"12px"}},[s("span",[t._v("Bản chính")]),t._v(" "),s("span",[t._v("Bản chụp")]),t._v(" "),s("span",[t._v("Công chứng")])])}]}},313:function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={props:["dataDetail"],data:function(){return{thongTinChiTietHoSo:{}}},computed:{loading:function(){return this.$store.getters.loading}},watch:{dataDetail:function(t){this.thongTinChiTietHoSo=t}},created:function(){var t=this;t.$nextTick(function(){t.dataDetail&&(t.thongTinChiTietHoSo=t.dataDetail)})},methods:{},filters:{dateTimeView:function(t){if(t){var e=new Date(t);return e.getDate().toString().padStart(2,"0")+"/"+(e.getMonth()+1).toString().padStart(2,"0")+"/"+e.getFullYear()+"  "+e.getHours().toString().padStart(2,"0")+":"+e.getMinutes().toString().padStart(2,"0")}return""}}}},316:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("v-card",[s("v-card-text",{staticClass:"pb-0"},[s("v-layout",{attrs:{wrap:""}},[s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Mã số hồ sơ: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm4:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.dossierIdCTN)+" ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Ngày tiếp nhận: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm4:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v(" "+t._s(t._f("dateTimeView")(t.thongTinChiTietHoSo.receiveDate)))])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Thủ tục: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm10:""}},[s("v-subheader",{staticClass:"pl-0 header-text-field text-header"},[t._v("  "+t._s(t.thongTinChiTietHoSo.serviceName)+" ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Chủ hồ sơ: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm4:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.applicantName)+" ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Mã số: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm4:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.dossierNo)+" ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Địa chỉ: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm10:""}},[s("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.address)+" ")])],1)],1)],1)],1)},staticRenderFns:[]}},353:function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var a=(s(21),s(271)),o=s.n(a),i=s(270),n=s.n(i);e.default={components:{thongtinchunghoso:o.a,"thanh-phan-ho-so":n.a},data:function(){return{thongTinLienThong:{},govAgencyItems:[],govAgency:"",loadingAction:!1}},computed:{loading:function(){return this.$store.getters.loading}},watch:{},created:function(){this.$nextTick(function(){})},methods:{initData:function(t){var e=this;e.$store.dispatch("getDetailDossier",t).then(function(t){e.thongTinLienThong=t,e.$refs.thanhphanhoso.initData(t)}).catch(function(t){console.log(t)}),e.$store.dispatch("getGovAgency").then(function(t){console.log("govAgency",t),e.govAgencyItems=t}).catch(function(t){console.log(t)})},postDossierLienThong:function(){console.log("đã nhận kết quả")},goBack:function(){var t=this,e=t.$router.history.current.params,s=t.$router.history.current.query;t.$router.push({path:"/danh-sach-ho-so/"+e.index,query:s})}},filters:{dateTimeView:function(t){if(t){var e=new Date(t);return e.getDate().toString().padStart(2,"0")+"/"+(e.getMonth()+1).toString().padStart(2,"0")+"/"+e.getFullYear()+"  "+e.getHours().toString().padStart(2,"0")+":"+e.getMinutes().toString().padStart(2,"0")}return""}}}},375:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",[s("v-expansion-panel",{staticClass:"expansion-p0",attrs:{expand:""}},[s("v-expansion-panel-content",{attrs:{value:!0}},[s("div",{attrs:{slot:"header"},slot:"header"},[s("div",{staticClass:"background-triangle-small"},[t._v("I. ")]),t._v("THÔNG TIN HỒ SƠ\n      ")]),t._v(" "),s("thongtinchunghoso",{attrs:{dataDetail:t.thongTinLienThong}}),t._v(" "),s("v-card",{staticClass:"bdt-0"},[s("v-card-text",{staticClass:"py-0"},[s("v-layout",{attrs:{wrap:""}},[s("v-flex",{attrs:{xs12:"",sm2:""}},[s("v-subheader",{staticClass:"pl-0"},[t._v("Cơ quan liên thông: ")])],1),t._v(" "),s("v-flex",{attrs:{xs12:"",sm6:""}},[s("v-select",{attrs:{items:t.govAgencyItems,"item-text":"itemName","item-value":"itemCode",placeholder:"Chọn cơ quan liên thông",autocomplete:"","return-object":"","hide-selected":""},model:{value:t.govAgency,callback:function(e){t.govAgency=e},expression:"govAgency"}})],1)],1)],1)],1)],1)],1),t._v(" "),s("v-expansion-panel",{staticClass:"expansion-pl",staticStyle:{position:"relative"}},[s("v-expansion-panel-content",{attrs:{value:!0}},[s("div",{attrs:{slot:"header"},slot:"header"},[s("div",{staticClass:"background-triangle-small"},[t._v(" II.")]),t._v("\n        KẾT QUẢ LIÊN THÔNG\n      ")]),t._v(" "),s("thanh-phan-ho-so",{ref:"thanhphanhoso"})],1)],1),t._v(" "),s("v-card-actions",{staticClass:"mt-2",staticStyle:{float:"right"}},[s("v-btn",{attrs:{color:"primary",loading:t.loadingAction,disabled:t.loadingAction},on:{click:t.goBack}},[t._v("\n      Đã nhận kết quả\n      "),s("span",{attrs:{slot:"loader"},slot:"loader"},[t._v("Loading...")])]),t._v(" "),s("v-btn",{staticStyle:{height:"30px"},attrs:{color:"primary",loading:t.loadingAction,disabled:t.loadingAction},on:{click:t.postDossierLienThong}},[s("v-icon",[t._v("undo")]),t._v("  \n      Quay lại\n      "),s("span",{attrs:{slot:"loader"},slot:"loader"},[t._v("Loading...")])],1)],1)],1)},staticRenderFns:[]}}});
//# sourceMappingURL=5.3e03e3a37890d423c691.js.map