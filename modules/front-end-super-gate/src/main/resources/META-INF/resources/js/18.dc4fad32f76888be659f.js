webpackJsonp([18],{287:function(t,e,a){var s=a(195)(a(358),a(374),null,null);t.exports=s.exports},358:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0}),e.default={data:function(){return{dossierId:"",dialog_add_dined:!1,loadingAction:!1,note_reason:"",resultFiles:[],feeAmount:"",thongTinChiTietHoSo:{},headers:[{text:"STT",align:"center",sortable:!1},{text:"Số giấy",align:"center",sortable:!1},{text:"Ngày cấp",align:"center",sortable:!1},{text:"Tên giấy tờ",align:"center",sortable:!1}],checkPaid:!1}},computed:{loading:function(){return this.$store.getters.loading},loadingTable:function(){return this.$store.getters.loadingTable}},created:function(){this.$nextTick(function(){})},methods:{initData:function(t){var e=this;e.dossierId=t,e.$store.dispatch("getDetailDossier",t).then(function(a){e.thongTinChiTietHoSo=a,e.$store.dispatch("loadDossierFiles",t).then(function(t){e.resultFiles=t.filter(function(t,e){return 2===t.dossierPartType&&!1===t.eForm})}).catch(function(t){console.log(t)}),e.$store.dispatch("loadDossierPayments",a).then(function(t){e.feeAmount=t.feeAmount}).catch(function(t){console.log(t)})}).catch(function(t){console.log(t)})},submitAddReason:function(t){console.log("note_reason",t)},traKetQua:function(){var t=this,e={dossierId:t.dossierId,actionCode:400};t.$store.dispatch("postAction",e).then(function(t){})},goBack:function(){window.history.back()},currency:function(t){if(t){return(t/1).toFixed(0).replace(".",",").toString().replace(/\B(?=(\d{3})+(?!\d))/g,".")}return""}},filters:{dateTimeView:function(t){if(t){var e=new Date(t);return e.getDate().toString().padStart(2,"0")+"/"+(e.getMonth()+1).toString().padStart(2,"0")+"/"+e.getFullYear()}return""}}}},374:function(t,e){t.exports={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"ketqua-detail"},[t.loading?a("content-placeholders",{staticClass:"mt-3"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("div",{staticClass:"row-header"},[a("div",{staticClass:"background-triangle-big"},[a("span",[t._v("TRẢ KẾT QUẢ HỒ SƠ")])]),t._v(" "),a("div",{staticClass:"layout row wrap header_tools row-blue"},[a("div",{staticClass:"flex xs8 sm10 pl-3 text-ellipsis text-bold"},[t._v("\n        "+t._s(t.thongTinChiTietHoSo.serviceName)+"\n      ")]),t._v(" "),a("div",{staticClass:"flex xs4 sm2 text-right",staticStyle:{"margin-left":"auto"}},[a("v-btn",{staticClass:"my-0 mx-0 btn-border-left",attrs:{flat:"","active-class":"temp_active"},on:{click:t.goBack}},[t._v("\n        Quay lại  \n          "),a("v-icon",{attrs:{size:"16"}},[t._v("undo")])],1)],1)])]),t._v(" "),a("v-expansion-panel",{staticClass:"expansion-p0",attrs:{expand:""}},[a("v-expansion-panel-content",{attrs:{value:!0}},[a("div",{attrs:{slot:"header"},slot:"header"},[a("div",{staticClass:"background-triangle-small"},[t._v("I. ")]),t._v("THÔNG TIN HỒ SƠ\n      ")]),t._v(" "),a("v-card",[a("v-card-text",[a("v-layout",{attrs:{wrap:""}},[a("v-flex",{attrs:{xs12:"",sm2:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Thủ tục: ")])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm10:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.serviceName)+" ")])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm2:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Mã hồ sơ: ")])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm4:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v(" "+t._s(t.thongTinChiTietHoSo.dossierIdCTN))])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm2:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Ngày tiếp nhận: ")])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm4:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v(" "+t._s(t._f("dateTimeView")(t.thongTinChiTietHoSo.receiveDate)))])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm2:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Chủ hồ sơ: ")])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm10:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.applicantName)+" ")])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm2:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Địa chỉ: ")])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm10:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v("  "+t._s(t.thongTinChiTietHoSo.address)+" ")])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm2:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Người nộp: ")])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm4:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v(" "+t._s(t.thongTinChiTietHoSo.delegateName)+" ")])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm2:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header"},[t._v("Số CMND: ")])],1),t._v(" "),a("v-flex",{attrs:{xs12:"",sm4:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("v-subheader",{staticClass:"pl-0 text-header header-text-field"},[t._v(" "+t._s(t.thongTinChiTietHoSo.applicantIdNo)+" ")])],1)],1)],1)],1)],1)],1),t._v(" "),a("v-expansion-panel",{staticClass:"expansion-p0 ex-table",attrs:{expand:""}},[a("v-expansion-panel-content",{attrs:{value:!0}},[a("div",{attrs:{slot:"header"},slot:"header"},[a("div",{staticClass:"background-triangle-small"},[t._v(" II. ")]),t._v("GIẤY TỜ TRẢ KẾT QUẢ\n      ")]),t._v(" "),a("v-card",[a("v-card-text",{staticClass:"px-0"},[t.loadingTable?a("content-placeholders",[a("content-placeholders-img"),t._v(" "),a("content-placeholders-heading")],1):a("v-data-table",{staticClass:"table-bordered",attrs:{headers:t.headers,items:t.resultFiles,"item-key":"no","hide-actions":"","no-data-text":"Không có giấy tờ kết quả"},scopedSlots:t._u([{key:"headerCell",fn:function(e){return[a("v-tooltip",{attrs:{bottom:""}},[a("span",{attrs:{slot:"activator"},slot:"activator"},[t._v("\n                  "+t._s(e.header.text)+"\n                ")]),t._v(" "),a("span",[t._v("\n                  "+t._s(e.header.text)+"\n                ")])])]}},{key:"items",fn:function(e){return[a("td",{staticClass:"text-xs-center",staticStyle:{width:"5%"}},[t._v(" "+t._s(e.index+1)+" ")]),t._v(" "),a("td",{staticClass:"text-xs-left",staticStyle:{width:"10%"}},[t._v(" "+t._s(e.item.deliverableCode)+" ")]),t._v(" "),a("td",{staticClass:"text-xs-left",staticStyle:{width:"10%"}},[t._v(" "+t._s(t._f("dateTimeView")(e.item.createDate))+" ")]),t._v(" "),a("td",{staticClass:"text-xs-left",staticStyle:{width:"75%"}},[t._v(" "+t._s(e.item.displayName)+" ")])]}}])})],1)],1)],1)],1),t._v(" "),a("v-flex",{attrs:{xs12:""}},[t.loading?a("content-placeholders",{staticClass:"mt-1"},[a("content-placeholders-text",{attrs:{lines:1}})],1):a("div",{staticClass:"pl-3 py-2 fee-info"},[a("v-checkbox",{attrs:{label:"Phí phải nộp: "+t.currency(t.feeAmount)+" VNĐ"},model:{value:t.checkPaid,callback:function(e){t.checkPaid=e},expression:"checkPaid"}}),t._v(" "),a("span",{staticClass:"red--text"},[t._v("* ")]),t._v(" Đánh dấu để xác định người làm thủ tục đã hoàn thành nộp phí.\n    ")],1)],1),t._v(" "),a("v-card-actions",{staticClass:"mt-2",staticStyle:{float:"right"}},[a("v-btn",{attrs:{color:"primary",loading:t.loadingAction,disabled:t.loadingAction},on:{click:t.traKetQua}},[t._v("\n      Trả kết quả\n      "),a("span",{attrs:{slot:"loader"},slot:"loader"},[t._v("Loading...")])]),t._v(" "),a("v-btn",{staticStyle:{height:"30px"},attrs:{color:"primary",loading:t.loadingAction,disabled:t.loadingAction},on:{click:t.goBack}},[a("v-icon",[t._v("undo")]),t._v("  \n      Quay lại\n      "),a("span",{attrs:{slot:"loader"},slot:"loader"},[t._v("Loading...")])],1)],1),t._v(" "),a("v-dialog",{attrs:{persistent:"","max-width":"500px"},model:{value:t.dialog_add_dined,callback:function(e){t.dialog_add_dined=e},expression:"dialog_add_dined"}},[a("v-card",[a("v-card-text",[a("v-container",{attrs:{"grid-list-md":""}},[a("v-layout",{attrs:{wrap:""}},[a("v-flex",{attrs:{xs12:""}},[a("v-text-field",{attrs:{placeholder:"Nhập lý do từ chối","multi-line":""},model:{value:t.note_reason,callback:function(e){t.note_reason=e},expression:"note_reason"}})],1)],1)],1)],1),t._v(" "),a("v-card-actions",[a("v-spacer"),t._v(" "),a("v-btn",{attrs:{color:"primary",flat:"flat",loading:t.loadingAction,disabled:t.loadingAction},nativeOn:{click:function(e){t.submitAddReason(t.note_reason)}}},[t._v("\n          Chấp nhận  \n          "),a("span",{attrs:{slot:"loader"},slot:"loader"},[t._v("Loading...")])]),t._v(" "),a("v-btn",{attrs:{color:"red darken-3",flat:"flat",loading:t.loadingAction,disabled:t.loadingAction},nativeOn:{click:function(e){t.dialog_add_dined=!1}}},[t._v("\n          Bỏ qua  \n          "),a("span",{attrs:{slot:"loader"},slot:"loader"},[t._v("Loading...")])])],1)],1)],1)],1)},staticRenderFns:[]}}});
//# sourceMappingURL=18.dc4fad32f76888be659f.js.map