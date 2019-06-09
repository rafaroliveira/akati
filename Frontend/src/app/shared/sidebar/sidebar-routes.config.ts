import { RouteInfo } from './sidebar.metadata';

//Sidebar menu Routes and data
export const ROUTES: RouteInfo[] = [

    { path: '/dashboard/dashboard1', title: 'Home', icon: 'ft-home', class: '', badge: '', badgeClass: '', isExternalLink: false, submenu: [] },
    { path: '/taskboard', title: 'Painel de propostas', icon: 'ft-file-text', class: '', badge: '', badgeClass: '', isExternalLink: false, submenu: [] },
    { path: '/components/badges', title: 'Nova proposta', icon: 'ft-plus', class: '', badge: '', badgeClass: '', isExternalLink: false, submenu: [] }
];
